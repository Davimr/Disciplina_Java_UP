package lista02;

import java.util.Collections;
import java.util.List;

/**
 * Essa classe vai servir para a resolu��o da lista 02 de exerc�cios.
 * 
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
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

		String[] opcoes = { "Mostra um vetor de inteiros populado pelo usu�rio.",
				"Mostra o maior elemento de um vetor de inteiros populado pelo usu�rio.",
				"Mostra o menor elemento e sua posi��o em um vetor de inteiro populado pelo usu�rio.",
				"Mostra um vetor populado pelo usu�rio, de forma reversa.",
				"Mostra a multiplica��o" + " de dois vetores de decimais definidos pelo usu�rio.",
				"C�lcula o produto escalar de dois vetores de inteiros definidos pelo usu�rio." };

		String titulo = "Selecione a op��o desejada:";

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
	 * Faz a execu��o de tela para mostrar um vetor de inteiros definido pelo
	 * usu�rio.
	 */
	public static void mostrarVetor() {

		int tamanhoVet = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");

		List<Integer> vetor = Exercicios.vetorInteiros(tamanhoVet);

		System.out.println(vetor + "\n");
	}

	/**
	 * Faz a execu��o de tela para mostrar o maior elemento de um vetor de inteiros
	 * definido pelo usu�rio.
	 */
	public static void maiorElementoVetor() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");

		System.out.println(Exercicios.maiorElementoVetor(tamanhoVetor));
	}

	/**
	 * Faz a execu��o de tela para mostrar o menor elemento e sua posi��o em um
	 * vetor definido pelo usu�rio.
	 */
	public static void menorElemento() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");

		int posicaoElemento[] = Exercicios.menorElemento(tamanhoVetor);

		System.out.println("O menor elemento � o " + posicaoElemento[0] + " e sua posi��o no vetor � "
				+ (posicaoElemento[1] + 1) + ".\n\n");
	}

	/**
	 * Faz a execu��o de tela para mostrar um vetor definido pelo usu�rio, ao
	 * contr�rio.
	 */
	public static void vetorReverso() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");

		List<Integer> vetorReverso = Exercicios.vetorInteiros(tamanhoVetor);

		Collections.reverse(vetorReverso);

		System.out.println(vetorReverso);
	}

	/**
	 * Faz a execu��o de tela para mostrar a multiplica��o de dois vetores de
	 * decimais definidos pelo usu�rio.
	 */
	public static void multiplicacaoVetores() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro dos vetores?");

		List<Double> vetorMultiplicado = Exercicios.multiplicacaoVetores(tamanhoVetor);

		System.out.println(vetorMultiplicado + "\n");
	}

	/**
	 * Faz a execu��o de tela para mostrar o c�lculo do produto escalar entre dois
	 * vetores de inteiros definidos pelo usu�rio.
	 */
	public static void produtoEscalar() {

		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro dos vetores?");

		Integer produtoEscalar = Exercicios.vetorProdutoEscalar(tamanhoVetor);

		System.out.println("\n" + "O produto escalar � " + produtoEscalar + "\n\n");
	}

}
