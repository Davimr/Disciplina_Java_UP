package lista03;

/**
 * Essa classe vai servir para a resolu��o da lista 03 de exerc�cios.
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
 */
public class Principal {

	/**
	 * Fun��o que da in�cio ao programa.
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
	 * Faz a execu��o da tela com as op��es ao usu�rio e devolve a escolha.
	 * @return - Op��o selecionada pelo usu�rio.
	 */
	public static int menu2() {

		String[] opcoes = { "C�lculo do peso ideal." };

		String titulo = "Selecione a op��o desejada:";

		String descricao = null;

		int menu = Console.mostrarMenu(opcoes, titulo, descricao);

		return menu;

	}

	/**
	 * Chama as fun��es de acordo com a sele��o do usu�rio.
	 * @param menu - Op��o selecionada pelo usu�rio.
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
	 * Faz a execu��o de tela para o c�lculo de peso ideal do usu�rio.
	 */
	public static void pesoIdeal() {
		
		//Pega as variaveis do teclado
		String sexo = Console.recuperaTexto("Digite o sexo M para masculino e F para feminino ");
		double h = Console.recuperaDecimal("Digite a altura em metros ");
		
		//Executa o c�lculo
		double pesoIdeal = Exercicios.pesoIdeal(sexo, h);
		
		//Printa na tela
		System.out.printf("O peso ideal � %.2f \n", pesoIdeal);
	}
}
