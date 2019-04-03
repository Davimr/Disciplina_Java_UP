package lista04;

import java.util.ArrayList;

/**
 * Classe principal de execução
 * 
 * @author DaviMR
 *
 */
public class Principal {
	
	/**
	 * Método que da início ao programa.
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

		String[] opcoes = { "Livros", "Pontos" };

		String titulo = "Selecione a opção desejada:";

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
			criarLivro();
			break;
		case 2:
			executarCenario2();
			break;
		}
	}
	
	/**
	 * Executa o cenário 2.
	 */
	public static void executarCenario2 () {
		
		//Ponto na origem, coordernadas (0, 0)
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto(2d, 5d);
		
		double dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2: " + dp1p2);
		double dp272 = ponto2.distancia(7d, 2d);
		System.out.println("dp272: " + dp272);
		ponto1.setX(10d);
		ponto1.setY(3d);
		dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2: " + dp1p2);
		
	}
	
	/**
	 * Cria um Livro pelo teclado.
	 * @return
	 */
	public static Livro criarLivro() {
		
		Livro livro = new Livro();
		
		String codigo = Console.recuperaTexto("Informe o código: ");
		livro.setCodigo(codigo);
		String titulo = Console.recuperaTexto("Informe o título: ");
		livro.setTitulo(titulo);
		
		ArrayList<String> autores = new ArrayList<>();
		Integer quantidade = Console.recuperaInteiro("Quantos autores?");
		for (int i = 0; i < quantidade; i ++) {
			String autor = Console.recuperaTexto("Informe o autor " + (i+1));
			autores.add(autor);
		}
		
		livro.setAutores(autores);
		String isbn = Console.recuperaTexto("Informe o ISBN: ");
		livro.setIsbn(isbn);
		Integer ano = Console.recuperaInteiro("Informe o ano: ");
		livro.setAno(ano);
		
		return livro;
	}

}
