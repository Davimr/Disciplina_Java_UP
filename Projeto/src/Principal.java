import java.util.ArrayList;

import entidade.Empresa;

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

		String[] opcoes = { "Cadastrar Empresa", "Consultar Empresas Cadastradas", "Excluir Empresa" };

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
			excluirEmpresa();
			break;
		}
	}
	
	static ArrayList<Empresa> empresas = new ArrayList<>();
	
	public static void cadastrarEmpresa() {
		
		String nomeEmpresa = Console.recuperaTexto("Digite o nome da empresa: ");
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa: ");
		
		Empresa empresa = new Empresa(nomeEmpresa, cnpj);
		
		try {
		if (!testarSeEmpresaExiste(empresa)) {
		
		empresas.add(empresa);
		}
		
		}
		 catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void consultarEmpresas() {
		
		for (Empresa empresa : empresas) {
			
			System.out.println(empresa);
			
		}
	}
	
	public static void excluirEmpresa() {
		
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa que deseja excluir: ");
		
		empresas.remove(empresas.indexOf(encontrarEmpresa(empresas, cnpj)));
		
	}
	
	public static void emitirNotaFiscal() {
		
		
	}
	
	public static boolean testarSeEmpresaExiste(Empresa empresa) throws Exception {
		
		if (!empresas.contains(empresa)) {
			return false;
		} else {
			throw new Exception("Empresa já existe!\n");
		}
	}
	
	public static Empresa encontrarEmpresa(ArrayList<Empresa> empresas, String cnpj) {
		
		for (int i = 0; i <= empresas.size() ; i++) {
			
			if (empresas.get(i).getCnpj().equals(cnpj)) {
				
				Empresa empresa = empresas.get(i);
				
				return empresa;
			}
		}
		
		return null;
		}
}
