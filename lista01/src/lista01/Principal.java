package lista01;

/**
 * Essa classe vai servir para a resolução da lista 01 de exercícios.
 *@author DaviMR
 *@version 1.0
 *@since 28/02/2019
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
		
		String[] opcoes = { "Cálculo do enésimo termo da PA.", "Cálculo da média Aritmetica.", 
				"Cálculo da média ponderada.", "Cálculo de conversão de celsius para fahrenheint.",
				"Cálculo de volume do cilindro.", "Cálculo de gasto de combustivel.",
				"Cálculo do valor final a ser pago por uma compra." };
		
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
	 * Faz a execução de tela do cálculo do enésimo termo da PA.
	 */
	public static void calcularEnesimoTermoPA() {
		
		//Pega as variaveis do teclado
		int a1 = Console.recuperaInteiro("Digite o valor de a1:");
		int n = Console.recuperaInteiro("Digite o valor de n:");
		int r = Console.recuperaInteiro("Digite o valor de r:");
		
		//Executa o calculo
		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);
		
		//Printa na tela 
		System.out.println("O resultado da an = " + an);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média aritmetica.
	 */
	public static void calcularMediaAritmetica() {
		
		//Pega as variaveis do teclado
		double nota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double nota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double nota3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		//Executa o calculo
		double mediaAritmetica = Exercicios.calcularMediaAritmetica(nota1, nota2, nota3);
		
		//Printa na tela
		System.out.printf("A média aritmetica é = %.2f\n\n", mediaAritmetica);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média ponderada.
	 */
	public static void calcularMediaPonderada() {
		
		//Pega as variaveis do teclado
		double dnota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double peso1 = Console.recuperaDecimal("Digite o peso da primeira nota:");
		double dnota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double peso2 = Console.recuperaDecimal("Digite o peso da segunda nota:");
		double dnota3 = Console.recuperaDecimal("Digite a terceira nota:");
		double peso3 = Console.recuperaDecimal("Digite o peso da terceira nota:");
		
		//Executa o calculo
		double mediaPonderada = Exercicios.calcularMediaPonderada(dnota1, peso1, dnota2, peso2, dnota3, peso3);
		
		//Printa na tela
		System.out.printf("A média ponderada é = %.2f\n\n", mediaPonderada);
	}
	
	/**
	 * Faz a execução de tela do cálculo de conversão de celsius para fahrenheint.
	 */
	public static void converterCelsiusParaFahrenheint() {
		
		//Pega as variaveis do teclado
		double tempCelsius = Console.recuperaDecimal("Digite a temperatura em Celsius:");
		
		//Executa o calculo
		double tempFahrenheint = Exercicios.converterCelsiusParaFahrenheint(tempCelsius);
		
		//Printa na tela
		System.out.printf("A temperatura convertida para fahrenheint ficou = %.2f\n\n", tempFahrenheint);
	}
	
	/**
	 * Faz a execução de tela do cálculo de volume do cilindro.
	 */
	public static void calcularVolumeCilindro() {
		
		//Pega as variaveis do teclado
		double raio = Console.recuperaDecimal("Digite o raio do cilindro:");
		double altura = Console.recuperaDecimal("Digite a altura do cilindro:");
		
		//Executa o calculo
		double volume = Exercicios.calcularVolumeCilindro(raio, altura);
		
		//Printa na tela
		System.out.printf("O volume do cilindro inserido é = %.2f\n\n", volume);
	}
	
	/**
	 * Faz a execução de tela do cálculo de gasto de combustivel.
	 */
	public static void calcularCombustivel() {
		
		//Pega as variaveis do teclado
		double tempo = Console.recuperaDecimal("Digite o tempo total da viagem em minutos:");
		double velocidadeMedia = Console.recuperaDecimal("Digite a velocidade média da viagem:");
		
		//Executa o calculo
		double gastoTotal = Exercicios.calcularCombustivel(tempo, velocidadeMedia);
		
		//Printa na tela
		System.out.printf("O gasto total de combustivel em litros foi = %.2f\n\n", gastoTotal);
	}
	
	/**
	 * Faz a execução de tela do cálculo do valor final a ser pago por uma compra.
	 */
	public static void calcularValorPago() {
		
		//Pega as variaveis do teclado
		double valorInicial = Console.recuperaDecimal("Digite o valor inicial do compra:");
		double acrescimo = Console.recuperaDecimal("Digite o valor do acrescimo:");
		
		//Executa o calculo
		double valorFinal = Exercicios.calcularValorPago(valorInicial, acrescimo);
		
		//Printa na tela
		System.out.printf("O valor final a ser pago é = %.2f\n\n", valorFinal);
	}
}



