import java.util.ArrayList;
import java.util.Collections;

import entidade.Empresa;
import entidade.Faturamento;
import entidade.Imposto;
import entidade.ImpostoAmapa;
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
	 * M�todo que da in�cio ao programa chamando o menu e utilizando a escolha
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
				"Emitir nota fiscal", "Cancelar nota fiscal", "Emitir relatórios",
				"Calcular faturamento", "Cancelar notas em lotes"};

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
			try {
			cancelarNotaFiscal();
			}
			catch (Exception e) {
				System.out.println(e);
			}
			break;
		case 6:
			emitirRelatorioDeNotas();
			break;
		case 7:
			calcularFaturamento();
			break;
		case 8:
			cancelarNotasEmLotes();
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
		
		ArrayList<NotaFiscal> notasValidas = new ArrayList<>();
		
		notasValidas = emp.getNotasFiscais();
		
		for (NotaFiscal notaFiscal : notasValidas) {
			
			if (notaFiscal.isCancelada()) {
				
				notasValidas.remove(notaFiscal);
			}
		}
		
		if (notasValidas.isEmpty()) {
		
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
		
		Integer estado = Console.recuperaInteiro("Digite 1 para PR, 2 para SC, 3 para SP, 4 para AP: ");
		
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
		case 4:
			imposto = new ImpostoAmapa(valor);
		}

		NotaFiscal notaFiscal = new NotaFiscal(numero, descricao, imposto, valor);
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		emp.addNota(notaFiscal);
	}
	
	/**
	 * M�todo para cancelar uma nota fiscal.
	 */
	public static void cancelarNotaFiscal() throws Exception {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa com a nota que deseja cancelar: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		ArrayList<NotaFiscal> notas = new ArrayList<>();
		
		notas = emp.getNotasFiscais();
		
		for (NotaFiscal notaFiscal : notas) {
			
			if(!notaFiscal.isCancelada()) {
				System.out.println(notaFiscal);
			}
		}
		
		String numero = Console.recuperaTexto("Digite o n�mero da nota fiscal que deseja cancelar: ");
		
		NotaFiscal nota = encontrarNotaFiscal(emp.getNotasFiscais(), numero);
		
		if (nota.getValorComImposto() <= 10000.00d) {
				
			nota.setCancelada(true);
			
		} else {
			throw new Exception ("N�o � possivel deletar notas com valor maior de 10 mil reais.");
		}

	}
	
	/**
	 * Emite os relat�rios de acordo com a seleção do usuário.
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
			
			ArrayList<NotaFiscal> notasValidas = new ArrayList<>();
			
			notasValidas = emp.getNotasFiscais();
			
			for (NotaFiscal notaFiscal : notasValidas) {
				
				if (notaFiscal.isCancelada()) {
					
					notasValidas.remove(notaFiscal);
				}
			}
			
			if (notasValidas.isEmpty()) {
			System.out.println(notasValidas);	
			}
				
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
	 * Realiza o c�lculo do faturamento de todas as notas de uma empresa sem os impostos.
	 */
	public static void calcularFaturamento() {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja calcular o faturamento: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		Double faturamento = Faturamento.calcFaturamento(emp.getNotasFiscais());
		
		System.out.println(faturamento);
	}
	
	/**
	 * Cancela notas em lotes de acordo com o valor setado pelo usu�rio.
	 */
	public static void cancelarNotasEmLotes() {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa com a nota que deseja cancelar: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		Double valor = Console.recuperaDecimal("Digite o valor m�nimo para cancelamento em lotes: ");
		
		ArrayList<NotaFiscal> notas = new ArrayList<>();
		
		notas = emp.getNotasFiscais();
		
		for (NotaFiscal notaFiscal : notas) {
			
			if (notaFiscal.getValor() < valor) {
				
				notaFiscal.setCancelada(true);
			}
			
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
