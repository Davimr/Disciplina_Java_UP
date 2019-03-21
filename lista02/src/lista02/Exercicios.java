package lista02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe para executar os exerc�cios da lista 02.
 * 
 * @author DaviMR
 */
public class Exercicios {

	/**
	 * M�todo que cria um vetor de inteiros populado pelo usu�rio.
	 * 
	 * @param tamanhoVet - Tamanho do vetor escolhido pelo usu�rio.
	 * @return - Vetor de inteiros populado.
	 */
	public static List<Integer> vetorInteiros(int tamanhoVetor) {

		List<Integer> vetorInteiros = new ArrayList<>();

		for (int i = 0; i < tamanhoVetor; i++) {

			vetorInteiros.add(Console.recuperaInteiro("Digite o valor para a posi��o " + (i + 1) + "."));
		}
		
		return vetorInteiros;
	}

	/**
	 * Ex02 . M�todo que retorna o valor do maior elemento dentro de um vetor de
	 * inteiros definido pelo usu�rio.
	 * 
	 * @param tamanhoVetor - Tamanho do vetor que o usu�rio predefiniu
	 *                     anteriormente.
	 * @return - Maior elemento do vetor.
	 */
	public static int maiorElementoVetor(int tamanhoVetor) {

		List<Integer> vetor = vetorInteiros(tamanhoVetor);

		Integer maior = Collections.max(vetor);

		return maior;
	}

	/**
	 * Ex03 . M�todo que retorna o menor elemento e sua posi��o em um vetor definido
	 * pelo usu�rio.
	 * 
	 * @param tamanhoVeto - Tamanho do vetor que o usu�rio predefiniu anteriormente.
	 * @return - Menor elemento e sua posi��o no vetor.
	 */
	public static int[] menorElemento(int tamanhoVetor) {

		List<Integer> vetor = vetorInteiros(tamanhoVetor);

		int[] menorPosicao = new int[2];

		menorPosicao[0] = Collections.min(vetor);

		menorPosicao[1] = vetor.indexOf(Collections.min(vetor));

		return menorPosicao;
	}

}
