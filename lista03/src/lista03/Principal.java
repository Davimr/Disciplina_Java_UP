package lista03;

/**
 * Essa classe vai servir para a resolução da lista 03 de exercícios.
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
 */
public class Principal {

	/**
	 * Função que da início ao programa.
	 * @param args
	 */
	public static void main(String[] args) {

		int menu = menu2();

		while (menu > -1) {

			swtch(menu);

			menu = menu2();
		}
	}

	/**
	 * Faz a execução da tela com as opções ao usuário e devolve a escolha.
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu2() {

		String[] opcoes = { "Cálculo do peso ideal." };

		String titulo = "Selecione a opção desejada:";

		String descricao = null;

		int menu = Console.mostrarMenu(opcoes, titulo, descricao);

		return menu;

	}

	/**
	 * Chama as funções de acordo com a seleção do usuário.
	 * @param menu - Opção selecionada pelo usuário.
	 */
	public static void swtch(int menu) {

		switch (menu) {
		case 1:
			pesoIdeal();
			break;
		case 2:
			
			break;
		case 3:
			
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
	 * Faz a execução de tela para o cálculo de peso ideal do usuário.
	 */
	public static void pesoIdeal() {
		
		//Pega as variaveis do teclado
		String sexo = Console.recuperaTexto("Digite o sexo M para masculino e F para feminino ");
		double h = Console.recuperaDecimal("Digite a altura em metros ");
		
		//Executa o cálculo
		double pesoIdeal = Exercicios.pesoIdeal(sexo, h);
		
		//Printa na tela
		System.out.printf("O peso ideal é %.2f \n", pesoIdeal);
	}
}
