package lista01;

/**
 * Essa classe vai servir para a resolu��o da lista 01 de exerc�cios.
 * 
 * @author DaviMR
 * @version 1.0
 * @since 28/02/2019
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

		String[] opcoes = { "C�lculo do en�simo termo da PA.", "C�lculo da m�dia Aritmetica.",
				"C�lculo da m�dia ponderada.", "C�lculo de convers�o de celsius para fahrenheint.",
				"C�lculo de volume do cilindro.", "C�lculo de gasto de combustivel.",
				"C�lculo do valor final a ser pago por uma compra." };

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
			calcularEnesimoTermoPA();
			break;
		case 2:
			calcularMediaAritmetica();
			break;
		case 3:
			calcularMediaPonderada();
			break;
		case 4:
			converterCelsiusParaFahrenheint();
			break;
		case 5:
			calcularVolumeCilindro();
			break;
		case 6:
			calcularCombustivel();
			break;
		case 7:
			calcularValorPago();
			break;
		}
	}

	/**
	 * Faz a execu��o de tela do c�lculo do en�simo termo da PA.
	 */
	public static void calcularEnesimoTermoPA() {

		int a1 = Console.recuperaInteiro("Digite o valor de a1:");
		int n = Console.recuperaInteiro("Digite o valor de n:");
		int r = Console.recuperaInteiro("Digite o valor de r:");

		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		System.out.println("O resultado da an = " + an + ".\n\n");
	}

	/**
	 * Faz a execu��o de tela do c�lculo da m�dia aritmetica.
	 */
	public static void calcularMediaAritmetica() {

		double nota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double nota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double nota3 = Console.recuperaDecimal("Digite a terceira nota:");

		double mediaAritmetica = Exercicios.calcularMediaAritmetica(nota1, nota2, nota3);

		System.out.printf("A m�dia aritmetica � = %.2f\n\n", mediaAritmetica);
	}

	/**
	 * Faz a execu��o de tela do c�lculo da m�dia ponderada.
	 */
	public static void calcularMediaPonderada() {

		double dnota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double peso1 = Console.recuperaDecimal("Digite o peso da primeira nota:");
		double dnota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double peso2 = Console.recuperaDecimal("Digite o peso da segunda nota:");
		double dnota3 = Console.recuperaDecimal("Digite a terceira nota:");
		double peso3 = Console.recuperaDecimal("Digite o peso da terceira nota:");

		double mediaPonderada = Exercicios.calcularMediaPonderada(dnota1, peso1, dnota2, peso2, dnota3, peso3);

		System.out.printf("A m�dia ponderada � = %.2f.\n\n", mediaPonderada);
	}

	/**
	 * Faz a execu��o de tela do c�lculo de convers�o de celsius para fahrenheint.
	 */
	public static void converterCelsiusParaFahrenheint() {

		double tempCelsius = Console.recuperaDecimal("Digite a temperatura em Celsius:");

		double tempFahrenheint = Exercicios.converterCelsiusParaFahrenheint(tempCelsius);

		System.out.printf("A temperatura convertida para fahrenheint ficou = %.2f.\n\n", tempFahrenheint);
	}

	/**
	 * Faz a execu��o de tela do c�lculo de volume do cilindro.
	 */
	public static void calcularVolumeCilindro() {

		double raio = Console.recuperaDecimal("Digite o raio do cilindro:");
		double altura = Console.recuperaDecimal("Digite a altura do cilindro:");

		double volume = Exercicios.calcularVolumeCilindro(raio, altura);

		System.out.printf("O volume do cilindro inserido � = %.2f.\n\n", volume);
	}

	/**
	 * Faz a execu��o de tela do c�lculo de gasto de combustivel.
	 */
	public static void calcularCombustivel() {

		double tempo = Console.recuperaDecimal("Digite o tempo total da viagem em minutos:");
		double velocidadeMedia = Console.recuperaDecimal("Digite a velocidade m�dia da viagem:");

		double gastoTotal = Exercicios.calcularCombustivel(tempo, velocidadeMedia);

		System.out.printf("O gasto total de combustivel em litros foi = %.2f.\n\n", gastoTotal);
	}

	/**
	 * Faz a execu��o de tela do c�lculo do valor final a ser pago por uma compra.
	 */
	public static void calcularValorPago() {

		double valorInicial = Console.recuperaDecimal("Digite o valor inicial do compra:");
		double acrescimo = Console.recuperaDecimal("Digite o valor do acrescimo:");

		double valorFinal = Exercicios.calcularValorPago(valorInicial, acrescimo);

		System.out.printf("O valor final a ser pago � = %.2f.\n\n", valorFinal);
	}
}
