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
	 * M�todo que cria um vetor de decimais populado pelo usu�rio.
	 * 
	 * @param tamanhoVetor - Tamanho do vetor escolhido pelo usu�rio.
	 * @return - Vetor de decimais populado.
	 */
	public static List<Double> vetorDouble(int tamanhoVetor) {

		List<Double> vetorDouble = new ArrayList<>();

		for (int i = 0; i < tamanhoVetor; i++) {

			vetorDouble.add(Console.recuperaDecimal("Digite o valor para a posi��o " + (i + 1) + "."));
		}

		return vetorDouble;
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

	/**
	 * Ex05 . M�todo que multiplica dois vetores de decimais populados pelo usu�rio.
	 * 
	 * @param tamanhoVetor - Tamanho dos vetores que o usu�rio escolheu.
	 * @return - Vetor multiplicado.
	 */
	public static List<Double> multiplicacaoVetores(int tamanhoVetor) {

		List<Double> vetorMultiplicado = new ArrayList<>();

		System.out.println("Digite os valores para o primeiro vetor: " + "\n");

		List<Double> primeiroVetor = vetorDouble(tamanhoVetor);

		System.out.println("\n" + "Digite os valores para o segundo vetor: " + "\n");

		List<Double> segundoVetor = vetorDouble(tamanhoVetor);

		for (int i = 0; i < tamanhoVetor; i++) {

			vetorMultiplicado.add(primeiroVetor.get(i) * segundoVetor.get(i));
		}

		return vetorMultiplicado;
	}

	/**
	 * Ex 06 . M�todo que calcula o produto escalar de dois vetores de inteiros
	 * definidos pelo usu�rio.
	 * 
	 * @param tamanhoVetor - Tamanho dos vetores que o usu�rio escolheu.
	 * @return - Produto escalar dos dois vetores.
	 */
	public static Integer vetorProdutoEscalar(int tamanhoVetor) {

		List<Integer> vetorProdutoEscalar = new ArrayList<>();

		Integer produtoEscalar;

		System.out.println("Digite os valores para o primeiro vetor: " + "\n");

		List<Integer> primeiroVetor = vetorInteiros(tamanhoVetor);

		System.out.println("\n" + "Digite os valores para o segundo vetor: " + "\n");

		List<Integer> segundoVetor = vetorInteiros(tamanhoVetor);

		for (int i = 0; i < tamanhoVetor; i++) {

			vetorProdutoEscalar.add(primeiroVetor.get(i) * segundoVetor.get(i));
		}

		produtoEscalar = vetorProdutoEscalar.stream().mapToInt(Integer::intValue).sum();

		return produtoEscalar;
	}

}
