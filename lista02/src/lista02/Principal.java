package lista02;

import java.util.Collections;
import java.util.List;

/**
 * Essa classe vai servir para a resolução da lista 02 de exercícios.
 * 
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
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

		String[] opcoes = { "Mostra um vetor de inteiros populado pelo usuário.",
				"Mostra o maior elemento de um vetor de inteiros populado pelo usuário.",
				"Mostra o menor elemento e sua posição em um vetor de inteiro populado pelo usuário.",
				"Mostra um vetor populado pelo usuário, de forma reversa.",
				"Mostra a multiplicação" + " de dois vetores de decimais definidos pelo usuário.",
				"Cálcula o produto escalar de dois vetores de inteiros definidos pelo usuário." };

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
			mostrarVetor();
			break;
		case 2:
			maiorElementoVetor();
			break;
		case 3:
			menorElemento();
			break;
		case 4:
			vetorReverso();
			break;
		case 5:
			multiplicacaoVetores();
			break;
		case 6:
			produtoEscalar();
			break;
		case 7:

			break;
		}
	}

	/**
	 * Faz a execução de tela para mostrar um vetor de inteiros definido pelo
	 * usuário.
	 */
	public static void mostrarVetor() {

		int tamanhoVet = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");

		List<Integer> vetor = Exercicios.vetorInteiros(tamanhoVet);

		System.out.println(vetor + "\n");
	}

	/**
	 * Faz a execução de tela para mostrar o maior elemento de um vetor de inteiros
	 * definido pelo usuário.
	 */
	public static void maiorElementoVetor() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");

		System.out.println(Exercicios.maiorElementoVetor(tamanhoVetor));
	}

	/**
	 * Faz a execução de tela para mostrar o menor elemento e sua posição em um
	 * vetor definido pelo usuário.
	 */
	public static void menorElemento() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");

		int posicaoElemento[] = Exercicios.menorElemento(tamanhoVetor);

		System.out.println("O menor elemento é o " + posicaoElemento[0] + " e sua posição no vetor é "
				+ (posicaoElemento[1] + 1) + ".\n\n");
	}

	/**
	 * Faz a execução de tela para mostrar um vetor definido pelo usuário, ao
	 * contrário.
	 */
	public static void vetorReverso() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");

		List<Integer> vetorReverso = Exercicios.vetorInteiros(tamanhoVetor);

		Collections.reverse(vetorReverso);

		System.out.println(vetorReverso);
	}

	/**
	 * Faz a execução de tela para mostrar a multiplicação de dois vetores de
	 * decimais definidos pelo usuário.
	 */
	public static void multiplicacaoVetores() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro dos vetores?");

		List<Double> vetorMultiplicado = Exercicios.multiplicacaoVetores(tamanhoVetor);

		System.out.println(vetorMultiplicado + "\n");
	}

	/**
	 * Faz a execução de tela para mostrar o cálculo do produto escalar entre dois
	 * vetores de inteiros definidos pelo usuário.
	 */
	public static void produtoEscalar() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro dos vetores?");

		Integer produtoEscalar = Exercicios.vetorProdutoEscalar(tamanhoVetor);

		System.out.println("\n" + "O produto escalar é " + produtoEscalar + "\n\n");
	}

}
