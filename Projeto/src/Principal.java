import java.util.ArrayList;

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
	 * Faz a execução da tela de menu com as opções ao usuário e devolve a escolha.
	 * 
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu() {

		String[] opcoes = { "Cadastrar Empresa", "Consultar Empresas Cadastradas", "Excluir Empresa", 
				"Emitir nota fiscal", "Cancelar nota fiscal" };

		String titulo = "\nSelecione a opção desejada:";

		String descricao = null;

		int opcao = Console.mostrarMenu(opcoes, titulo, descricao);

		return opcao;
	}

	/**
	 * Chama os métodos de acordo com a seleção do usuário.
	 * 
	 * @param menu - Opção selecionada pelo usuário.
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
		}
	}
	
	static ArrayList<Empresa> empresas = new ArrayList<>();
	
	static Empresa empresa = null;
	
	/**
	 * Método para cadastrar uma empresa.
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
	 * Método para consultar uma empresa.
	 */
	public static void consultarEmpresas() {
		
		for (Empresa empresa : empresas) {
			
			System.out.println(empresa);
			
		}
	}
	
	/**
	 * Método para excluir uma empresa.
	 */
	public static void excluirEmpresa() throws Exception {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja excluir: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		if (emp.getNotasFiscaisValidas().isEmpty()) {
		
		empresas.remove(empresas.indexOf(encontrarEmpresa(empresas, cnpj)));
		} else {
			throw new Exception ("Empresa não pode ser excluída pois possui notas válidas.");
		}
		
	}
	
	/**
	 * Método para emitar uma nota fiscal.
	 */
	public static void emitirNotaFiscal() {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja emitir a nota fiscal: ");
		
		String numero = Console.recuperaTexto("Digite o número da nota fiscal: ");
		
		String descricao = Console.recuperaTexto("Digite o motivo para a emissão da nota fiscal: ");
		
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
	 * Método para cancelar uma nota fiscal.
	 */
	public static void cancelarNotaFiscal () {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa com a nota que deseja cancelar: ");
		
		Empresa emp = encontrarEmpresa(empresas, cnpj);
		
		System.out.println(emp.getNotasFiscaisValidas());
		
		String numero = Console.recuperaTexto("Digite o número da nota fiscal que deseja cancelar: ");
		
		NotaFiscal nota = encontrarNotaFiscal(emp.getNotasFiscaisValidas(), numero);
		
		nota.setCancelada(true);
	}
	
	public static void emitirRelatorioDeNotas () {

	}
	
	/**
	 * Método para testar de uma empresa existe.
	 * @param empresa
	 * @return
	 * @throws Exception
	 */
	public static boolean testarSeEmpresaExiste(Empresa empresa) throws Exception {
		
		if (!empresas.contains(empresa)) {
			return false;
		} else {
			throw new Exception("Empresa já existe!\n");
		}
	}
	
	/**
	 * Método para encontrar uma empresa existente.
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
