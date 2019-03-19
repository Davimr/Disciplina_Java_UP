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

		String[] opcoes = { "Cálculo do peso ideal.", "Cálculo equação do segundo grau.",
				"Cálculo do valor final a ser pago.",  "Cálculo entre dois números.",
				"Teste do tipo de triângulo", "Cálculo do fatorial de um número.","Exibe uma sequência de números de acordo com a escolha do usuário"};

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
			equacao2Grau();
			break;
		case 3:
			valorFinalPago();
			break;
		case 4:
			calculadora();
			break;
		case 5:
			testeTriangulo();
			break;
		case 6:
			fatorial();
			break;
		case 7:
			sequencia1();
			break;
		}
	}
	
	/**
	 * Faz a execução de tela para o cálculo de peso ideal do usuário.
	 */
	public static void pesoIdeal() {
		
		//Pega as variaveis do teclado
		String sexo = Console.recuperaTexto("Digite o sexo M para masculino e F para feminino: ");
		double h = Console.recuperaDecimal("Digite a altura em metros: ");
		
		//Executa o cálculo
		double pesoIdeal = Exercicios.pesoIdeal(sexo, h);
		
		//Printa na tela
		System.out.printf("O peso ideal é %.2f kg. \n\n", pesoIdeal);
	}
	
	/**
	 * Faz a execução de tela para cálcular a equação do segundo grau.
	 */
	public static void equacao2Grau () {
		
		double a = Console.recuperaDecimal("Digite o valor de a: ");
		double b = Console.recuperaDecimal("Digite o valor de b: ");
		double c = Console.recuperaDecimal("Digite o valor de c: ");
		
		double[] raizes = Exercicios.calculoEquacao2Grau(a, b, c);
		
		if (raizes.length == 0) {
			
			System.out.printf("Não existem raízes reais.\n\n");
		}
		
		if (raizes.length == 1) {
			
			System.out.printf("Existe uma raiz real: %.2f \n\n", raizes[0]);
		}
		
		if (raizes.length == 2) {
			
			System.out.printf("Raiz 1: %.2f \n\n", raizes [0]);
			System.out.printf("Raiz 2: %.2f \n\n", raizes[1]);
		}
	}
	
	/**
	 * Faz a execução de tela para cálculo do preço final de um produto.
	 */
	public static void valorFinalPago () {
		
		//Pega as variaveis do teclado
		double precoInicial = Console.recuperaDecimal("Digite o valor inicial do produto em reais: ");
		int metodoPagamento = Console.recuperaInteiro("Digite o método de pagamento 1 2 3 ou 4: ");
		
		//Executa o cálculo
		double precoFinal = Exercicios.valorFinalPago(precoInicial, metodoPagamento);
		
		//Printa na tela
		System.out.printf("O valor final do produto é: %.2f \n\n", precoFinal);
	}
	
	/**
	 * Faz a execução de tela para cálculo entre dois números dados pelo usuário de acordo com a opção escolhida.
	 */
	public static void calculadora () {
		
		double primeiroNum = Console.recuperaDecimal("Digite o primeiro número para o cálculo: ");
		double segundoNum = Console.recuperaDecimal("Digite o segundo número para o cálculo: ");
		int operacao = Console.recuperaInteiro("Digite a operação desejada 1 a 4: ");
		
		double resposta = Exercicios.calculadora(primeiroNum, segundoNum, operacao);
		
		System.out.println("O resultado do cálculo é " + resposta + "\n\n");
	}
	
	public static void testeTriangulo () {
		
		int x1 = Console.recuperaInteiro("Digite o lado 1 do primeiro ponto ");
		int y1 = Console.recuperaInteiro("Digite o lado 2 do primeiro ponto ");
		int x2 = Console.recuperaInteiro("Digite o lado 1 do segundo ponto ");
		int y2 = Console.recuperaInteiro("Digite o lado 2 do segundo ponto ");
		int x3 = Console.recuperaInteiro("Digite o lado 1 do terceiro ponto ");
		int y3 = Console.recuperaInteiro("Digite o lado 2 do terceiro ponto ");
		
		String tipo_triangulo = Exercicios.testeTriangulo(x1, y1, x2, y2, x3, y3);
		
		System.out.println(tipo_triangulo + "\n\n");
		
	}
	
	/**
	 * Faz a execução de tela para o cálculo do fatorial de um número escolhido pelo usuário.
	 */
	public static void fatorial () {
		
		int numeroEscolhido = Console.recuperaInteiro("Digite um número inteiro para o cálculo: ");
		
		int result = Exercicios.fatorial(numeroEscolhido);
		
		System.out.println("O fatorial do número escolhido é " + result + "\n\n");
	}
	
	/**
	 * Faz a execução de tela para a exibição de uma sequencia de números de acordo com a escolha do usuário.
	 */
	public static void sequencia1 () {
		
		int numeroo = Console.recuperaInteiro("Digite o número desejado ");
		
		Exercicios.sequencia1(numeroo);
		
		System.out.printf("\n\n");
	}
}
