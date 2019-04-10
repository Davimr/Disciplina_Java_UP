package prova01;

import java.util.ArrayList;

/**
 * Classe utilizada para a resolução da prova.
 * 
 * @author DaviMR, Rafael Kohler, Leandro Zeni
 *
 */
public class DesenhoMatriz {

	/**
	 * Monta matriz em cruz com array primitivo.
	 * 
	 * @param dimensao - Tamanho da matriz.
	 * @param borda - Decisão se tera bordas ou não.
	 * @return
	 */
	public static String[][] montarMatrizCruz(Integer dimensao, boolean borda) {

		String[][] matriz = new String[dimensao][dimensao];

		Integer meio = dimensao / 2;

		Integer meio2 = dimensao / 2 - 1;

		if (dimensao % 2 == 0) {

			for (int i = 0; i < dimensao; i++) {

				matriz[i][meio] = "X";
				matriz[i][meio2] = "X";

				for (int j = 0; j < dimensao; j++) {
					if (i == meio || j == meio || i == meio2 || j == meio2) {
						matriz[i][j] = "X";
					}
				}
			}

		} else {
			for (int i = 0; i < dimensao; i++) {

				matriz[i][meio] = "X";

				for (int j = 0; j < dimensao; j++) {
					if (i == meio || j == meio) {
						matriz[i][j] = "X";
					}
				}
			}
		}
		if (borda) {
			matriz = comBorda(matriz);
		}

		return matriz;
	}

	/**
	 * Monta matriz em X com array primitivo.
	 * @param dimensao - Tamanho da matriz.
	 * @param borda - Decisão se tera bordas ou não.
	 * @return
	 */
	public static String[][] montarMatrizX(Integer dimensao, boolean borda) {

		String[][] matriz = new String[dimensao][dimensao];
		for (int i = 0; i < dimensao; i++) {
			matriz[i][i] = "X";
			for (int j = 0; j < dimensao; j++) {
				if ((i == j) || (i + j == dimensao - 1)) {
					matriz[i][j] = "X";
				}
			}
		}
		if (borda) {
			matriz = comBorda(matriz);
		}

		return matriz;
	}

	/**
	 * Método privado que monta a borda das matrizes de array primitivo.
	 * 
	 * @param matriz - Matriz que ira receber a borda.
	 * @return
	 */
	private static String[][] comBorda(String[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz.length - 1) {
					matriz[i][j] = "X";
				}
			}

		}
		return matriz;
	}

	/**
	 * 
	 * Monta matriz em CRUZ com usando ArrayList
	 * 
	 * @param tamanhoVetor
	 * 
	 * @param borda
	 * 
	 * @return
	 * 
	 */

	public static ArrayList<ArrayList<String>> matrizCruzArrayList(int tamanhoVetor, boolean borda) {

		ArrayList<ArrayList<String>> matriz = new ArrayList<>();

		Integer meio = tamanhoVetor / 2;

		if (tamanhoVetor % 2 != 0) {

			for (int i = 0; i < tamanhoVetor; i++) {

				ArrayList<String> matrizInterna = new ArrayList<>();

				for (int j = 0; j < tamanhoVetor; j++) {

					if (i == meio || j == meio) {

						matrizInterna.add("X");

					} else {

						matrizInterna.add("O");

					}

				}

				matriz.add(matrizInterna);

			}

		} else {

			for (int i = 0; i < tamanhoVetor; i++) {

				ArrayList<String> matrizInterna = new ArrayList<>();

				for (int j = 0; j < tamanhoVetor; j++) {

					if (i == meio || j == meio || i == meio - 1 || j == meio - 1) {

						matrizInterna.add("X");

					} else {

						matrizInterna.add("O");

					}

				}

				matriz.add(matrizInterna);

			}

		}

		if (borda) {

			return comBordaString(matriz);

		}

		return matriz;

	}

	/**
	 * 
	 * Monta matriz em X com usando ArrayList
	 * 
	 * @param tamanhoVetor
	 * 
	 * @param borda
	 * 
	 * @return
	 * 
	 */

	public static ArrayList<ArrayList<String>> matrizXArrayList(int tamanhoVetor, boolean borda) {

		ArrayList<ArrayList<String>> matriz = new ArrayList<>();

		for (int i = 0; i < tamanhoVetor; i++) {

			ArrayList<String> matrizInterna = new ArrayList<>();

			for (int j = 0; j < tamanhoVetor; j++) {

				if (i == j || (i + j == tamanhoVetor - 1)) {

					matrizInterna.add("X");

				} else {

					matrizInterna.add("O");

				}

			}

			matriz.add(matrizInterna);

		}

		if (borda) {

			return comBordaString(matriz);

		}

		return matriz;

	}

	/**
	 * 
	 * Constroi as bordas de uma matriz
	 * 
	 * @param matriz
	 * 
	 * @return String
	 * 
	 */

	private static ArrayList<ArrayList<String>> comBordaString(ArrayList<ArrayList<String>> matriz) {

		for (int i = 0; i < matriz.size(); i++) {

			for (int j = 0; j < matriz.size(); j++) {

				if (i == 0 || i == matriz.size() - 1 || j == 0 || j == matriz.size() - 1) {

					matriz.get(i).set(j, "X");

				}

			}

		}

		return matriz;

	}
}
