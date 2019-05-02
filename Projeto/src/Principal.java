import java.util.ArrayList;
import java.util.Collections;

import entidade.Empresa;
import entidade.Imposto;
import entidade.ImpostoParana;
import entidade.ImpostoSantaCatarina;
import entidade.ImpostoSaoPaulo;
import entidade.NotaFiscal;

/**
 * Classe principal do programa
 * 
 * @author DaviMR
 *
 */
public class Principal {
	
	/**
	 * Método que da início ao programa chamando o menu e utilizando a escolha
	 * gerada nele.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int opcao = menu();

		while (opcao > -1) {

			selecao(opcao);

			opcao = menu();
		}
	}

	/**
	 * Faz a execu��o da tela de menu com as op��es ao usu�rio e devolve a escolha.
	 * 
	 * @return - Op��o selecionada pelo usu�rio.
	 */
	public static int menu() {

		String[] opcoes = { "Cadastrar Empresa", "Consultar Empresas Cadastradas", "Excluir Empresa", 
				"Emitir nota fiscal", "Cancelar nota fiscal", "Emitir relatórios" };

		String titulo = "\nSelecione a op��o desejada:";

		String descricao = null;

		int opcao = Console.mostrarMenu(opcoes, titulo, descricao);

		return opcao;
	}

	/**
	 * Chama os m�todos de acordo com a sele��o do usu�rio.
	 * 
	 * @param menu - Op��o selecionada pelo usu�rio.
	 */
	public static void selecao(int opcao) {

		switch (opcao) {
		case 1:
			cadastrarEmpresa();
			break;
		case 2:
			consultarEmpresas();
			break;
		case 3:
			try {
			excluirEmpresa();
			}
			catch (Exception e) {
				System.out.println(e);
			}
			break;
		case 4:
			emitirNotaFiscal();
			break;
		case 5:
			cancelarNotaFiscal();
			break;
		case 6:
			emitirRelatorioDeNotas();
			break;
		}
	}
	
	static ArrayList<Empresa> empresas = new ArrayList<>();
	
	static Empresa empresa = null;
	
	/**
	 * M�todo para cadastrar uma empresa.
	 */
	public static void cadastrarEmpresa() {
		
		String nomeEmpresa = Console.recuperaTexto("Digite o nome da empresa: ");
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa: ");
		
		empresa = new Empresa(nomeEmpresa, cnpj);
		
		try {
		if (!testarSeEmpresaExiste(empresa)) {
		
		empresas.add(empresa);
		
		System.out.println("Empresa criada com sucesso!\n");
		}
		
		}
		 catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * M�todo para consultar uma empresa.
	 */
	public static void consultarEmpresas() {
		
		for (Empresa empresa : empresas) {
			
			System.out.println(empresa);
			
		}
	}
	
	/**
	 * M�todo para excluir uma empresa.
	 */
	public static void excluirEmpresa() throws Exception {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja excluir: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		if (emp.getNotasFiscaisValidas().isEmpty()) {
		
			empresas.remove(empresas.indexOf(encontrarEmpresa(empresas, cnpj)));
		} else {
			throw new Exception ("Empresa n�o pode ser exclu�da pois possui notas v�lidas.");
		}
		
	}
	
	/**
	 * M�todo para emitar uma nota fiscal.
	 */
	public static void emitirNotaFiscal() {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja emitir a nota fiscal: ");
		
		String numero = Console.recuperaTexto("Digite o n�mero da nota fiscal: ");
		
		String descricao = Console.recuperaTexto("Digite o motivo para a emiss�o da nota fiscal: ");
		
		Double valor =  Console.recuperaDecimal("Digite o valor da nota fiscal: ");
		
		Integer estado = Console.recuperaInteiro("Digite 1 para PR, 2 para SC, 3 para SP: ");
		
		Imposto imposto = null;
		
		switch (estado) {
		
		case 1:
			imposto = new ImpostoParana(valor);
			break;
		case 2:
			imposto = new ImpostoSantaCatarina(valor);
			break;
		case 3:
			imposto = new ImpostoSaoPaulo(valor);
			break;
		}

		NotaFiscal notaFiscal = new NotaFiscal(numero, descricao, imposto, valor);
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		emp.addNota(notaFiscal);
	}
	
	/**
	 * M�todo para cancelar uma nota fiscal.
	 */
	public static void cancelarNotaFiscal () {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa com a nota que deseja cancelar: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		System.out.println(emp.getNotasFiscaisValidas());
		
		String numero = Console.recuperaTexto("Digite o n�mero da nota fiscal que deseja cancelar: ");
		
		NotaFiscal nota = encontrarNotaFiscal(emp.getNotasFiscaisValidas(), numero);
		
		nota.setCancelada(true);
		
		ArrayList<NotaFiscal> notaas = new ArrayList<>();
		
		notaas = emp.getNotasFiscaisValidas();
		
		notaas.remove(nota);
		
		notaas.remove(nota);
		
		
	}
	
	/**
	 * Emite os relatórios de acordo com a seleção do usuário.
	 */
	public static void emitirRelatorioDeNotas () {

		Integer opcao = Console.recuperaInteiro("Digite 1 p/ notas fiscais por empresas\n"
				+ "2 p/ notas fiscais canceladas por empresa\n"
				+ "3 p/ notas fiscais ordenadas por valor da nota.");
		
		String cnpj = null;
		
		Empresa emp = null;
		
		switch (opcao) {
		case 1:
			cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja o relatório: ");
			emp = encontrarEmpresa(empresas, cnpj);
			System.out.println(emp.getNotasFiscais());
			break;
		case 2:
			cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja o relatório: ");
			emp = encontrarEmpresa(empresas, cnpj);
			System.out.println(emp.getNotasFiscaisCanceladas());
			break;
		case 3:
			cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja o relatório: ");
			emp = encontrarEmpresa(empresas, cnpj);
			ArrayList<NotaFiscal> notas = new ArrayList<>(); 
			notas = emp.getNotasFiscais();
			Collections.sort(notas);
			System.out.println(notas);
			break;
		}
	}
	
	/**
	 * M�todo para testar de uma empresa existe.
	 * @param empresa
	 * @return
	 * @throws Exception
	 */
	public static boolean testarSeEmpresaExiste(Empresa empresa) throws Exception {
		
		if (!empresas.contains(empresa)) {
			return false;
		} else {
			throw new Exception("Empresa j� existe!\n");
		}
	}
	
	/**
	 * M�todo para encontrar uma empresa existente.
	 * @param empresas
	 * @param cnpj
	 * @return
	 */
	public static Empresa encontrarEmpresa(ArrayList<Empresa> empresas, String cnpj) {
		
		for (int i = 0; i <= empresas.size() ; i++) {
			
			if (empresas.get(i).getCnpj().equals(cnpj)) {
				
				Empresa empresa = empresas.get(i);
				
				return empresa;
			}
		}
		
		return null;
		}
	
	public static NotaFiscal encontrarNotaFiscal(ArrayList<NotaFiscal> notaFiscal, String numero) {
		
		for (int i = 0; i <= notaFiscal.size() ; i++) {
			
			if (notaFiscal.get(i).getNumero().equals(numero)) {
				
				NotaFiscal notaFiscall = notaFiscal.get(i);
				
				return notaFiscall;
			}
		}
		
		return null;
		}
}
