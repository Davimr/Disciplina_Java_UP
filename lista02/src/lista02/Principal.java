package lista02;

import java.util.List;

/**
 * Essa classe vai servir para a resolução da lista 02 de exercícios.
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
 */
public class Principal {

	/**
	 * Método que da início ao programa chamando o menu e utilizando a escolha gerada nele.
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
		 * Faz a execução da tela de menu com as opções ao usuário e devolve a escolha.
		 * @return - Opção selecionada pelo usuário.
		 */
		public static int menu2() {

			String[] opcoes = {"Mostra um vetor de inteiros populado pelo usuário.", 
					"Mostra o maior elemento de um vetor de inteiros populado pelo usuário.", 
					"Mostra o menor elemento e sua posição em um vetor de inteiro populado pelo usuário."};

			String titulo = "Selecione a opção desejada:";

			String descricao = null;

			int menu = Console.mostrarMenu(opcoes, titulo, descricao);

			return menu;
		}

		/**
		 * Chama os métodos de acordo com a seleção do usuário.
		 * @param menu - Opção selecionada pelo usuário.
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
	 * Faz a execução de tela para mostrar um vetor de inteiros definido pelo usuário.
	 */
	public static void mostrarVetor() {
		
		int tamanhoVet = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");
		
		List<Integer> vetor = Exercicios.vetorInteiros(tamanhoVet);
		
		System.out.println(vetor + "\n");
	}
	
	/**
	 * Faz a execução de tela para mostrar o maior elemento de um vetor de inteiros definido pelo usuário.
	 */
	public static void maiorElementoVetor() {
		
		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");
		
		System.out.println(Exercicios.maiorElementoVetor(tamanhoVetor));
	}
	
	/**
	 * Faz a execução de tela para mostrar o menor elemento e sua posição em um vetor definido pelo usuário.
	 */
	public static void menorElemento() {
		
		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos irão conter dentro do vetor?");
		
		int posicaoElemento[] = Exercicios.menorElemento(tamanhoVetor);
		
		System.out.println("O menor elemento é o " + posicaoElemento[0] + " e sua posição no vetor é " + (posicaoElemento[1]+1) + ".\n\n");
	}
	
}
