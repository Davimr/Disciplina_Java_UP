package prova01;

import java.util.ArrayList;

/**
 * Essa classe ira servir para a resolução da primeira prova de java.
 * 
 * @author DaviMR, Rafael Kohler, Leandro Zeni
 *
 */
public class principal {

	/**
	 * Método que da início ao programa.
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

		String[] opcoes = { "Formar Matriz Cruz", "Formar Matriz Cruz com bordas", "Formar Matriz X",
				"Formar Matriz X com bordas", "Formar Matriz Cruz com array", "Formar Matriz X com array" };

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
			formarMatrizCruz();
			break;
		case 2:
			formarMatrizCruzBordas();
			break;
		case 3:
			formarMatrizX();
			break;
		case 4:
			formarMatrizXBordas();
			break;
		case 5:
			formarMatrizCruzArray();
			break;
		case 6:
			formarMatrizXArray();
			break;
		}

	}

	/**
	 * Forma uma matriz em cruz sem bordas com array primitivo.
	 */
	public static void formarMatrizCruz() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = false;
		String[][] matriz = DesenhoMatriz.montarMatrizCruz(tamanho, borda);

		printarMatriz(matriz);

	}

	/**
	 * Forma uma matriz em X com bordas usando array primitivo.
	 */
	public static void formarMatrizXBordas() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = true;
		String[][] matriz = DesenhoMatriz.montarMatrizX(tamanho, borda);

		printarMatriz(matriz);
	}

	/**
	 * Forma uma matriz em cruz com bordas usando array primitivo.
	 */
	public static void formarMatrizCruzBordas() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = true;
		String[][] matriz = DesenhoMatriz.montarMatrizCruz(tamanho, borda);

		printarMatriz(matriz);
	}

	/**
	 * Forma matriz em X usando array primitivo.
	 */
	public static void formarMatrizX() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = false;
		String[][] matriz = DesenhoMatriz.montarMatrizX(tamanho, borda);

		printarMatriz(matriz);
	}

	/**
	 * Printa na tela uma matriz de array primitivo.
	 * @param valores - Matriz a ser printada.
	 */
	public static void printarMatriz(String[][] valores) {
		if (valores.length == 0) {
			System.out.println("[]");
		} else if (valores.length == 1) {
			System.out.println("[" + valores[0][0] + "]");
		} else {
			for (int i = 0; i < valores.length; i++) {
				for (int j = 0; j < valores.length; j++) {
					if (valores[i][j] == null) {
						System.out.print(" ");
					} else
						System.out.print(valores[i][j] + "");
				}
				System.out.println("");
			}
		}
	}

	/**
	 * Forma uma matriz em X com ou sem bordas usando arraylist.
	 */
	private static void formarMatrizXArray() {
		int tamanhoVetor = Console.recuperaInteiro("Digite o tamanho da Matriz");

		int teste = Console.recuperaInteiro("Digite 1 para borda e 2 para sem borda.");

		boolean borda = false;
		if (teste == 1) {

			borda = true;
		}
		
		ArrayList<ArrayList<String>> matriz = DesenhoMatriz.matrizXArrayList(tamanhoVetor, borda);
		
		for (ArrayList<String> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}

	/**
	 * Forma uma matriz em cruz com ou sem bordas usando arraylist.
	 */
	private static void formarMatrizCruzArray() {
		int tamanhoVetor = Console.recuperaInteiro("Digite o tamanho da Matriz");
		
		int teste = Console.recuperaInteiro("Digite 1 para borda e 2 para sem borda.");
		
		boolean borda = false;
		if (teste == 1 ) {
		
			borda = true;
		}
		
		ArrayList<ArrayList<String>> matriz = DesenhoMatriz.matrizCruzArrayList(tamanhoVetor, borda);
		
		for (ArrayList<String> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}
}
