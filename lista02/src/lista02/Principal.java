package lista02;

import java.util.List;

/**
 * Essa classe vai servir para a resolu��o da lista 02 de exerc�cios.
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
 */
public class Principal {

	/**
	 * M�todo que da in�cio ao programa chamando o menu e utilizando a escolha gerada nele.
	 * @param args
	 */
	public static void main (String[] args) {
		
		int menu = menu2();

		while (menu > -1) {

			swtch(menu);

			menu = menu2();
		}
	}
	
		/**
		 * Faz a execu��o da tela de menu com as op��es ao usu�rio e devolve a escolha.
		 * @return - Op��o selecionada pelo usu�rio.
		 */
		public static int menu2() {

			String[] opcoes = {"Mostra um vetor de inteiros populado pelo usu�rio.", 
					"Mostra o maior elemento de um vetor de inteiros populado pelo usu�rio.", 
					"Mostra o menor elemento e sua posi��o em um vetor de inteiro populado pelo usu�rio."};

			String titulo = "Selecione a op��o desejada:";

			String descricao = null;

			int menu = Console.mostrarMenu(opcoes, titulo, descricao);

			return menu;
		}

		/**
		 * Chama os m�todos de acordo com a sele��o do usu�rio.
		 * @param menu - Op��o selecionada pelo usu�rio.
		 */
		public static void swtch(int menu) {

			switch (menu) {
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

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			}
		}
		
	/**
	 * Faz a execu��o de tela para mostrar um vetor de inteiros definido pelo usu�rio.
	 */
	public static void mostrarVetor() {
		
		int tamanhoVet = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");
		
		List<Integer> vetor = Exercicios.vetorInteiros(tamanhoVet);
		
		System.out.println(vetor + "\n");
	}
	
	/**
	 * Faz a execu��o de tela para mostrar o maior elemento de um vetor de inteiros definido pelo usu�rio.
	 */
	public static void maiorElementoVetor() {
		
		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");
		
		System.out.println(Exercicios.maiorElementoVetor(tamanhoVetor));
	}
	
	/**
	 * Faz a execu��o de tela para mostrar o menor elemento e sua posi��o em um vetor definido pelo usu�rio.
	 */
	public static void menorElemento() {
		
		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");
		
		int posicaoElemento[] = Exercicios.menorElemento(tamanhoVetor);
		
		System.out.println("O menor elemento � o " + posicaoElemento[0] + " e sua posi��o no vetor � " + (posicaoElemento[1]+1) + ".\n\n");
	}
	
}
