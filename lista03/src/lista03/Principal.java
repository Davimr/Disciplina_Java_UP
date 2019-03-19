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

		String[] opcoes = { "C�lculo do peso ideal.", "C�lculo equa��o do segundo grau.",
				"C�lculo do valor final a ser pago.",  "C�lculo entre dois n�meros.",
				"Teste do tipo de tri�ngulo", "C�lculo do fatorial de um n�mero.","Exibe uma sequ�ncia de n�meros de acordo com a escolha do usu�rio"};

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
	 * Faz a execu��o de tela para o c�lculo de peso ideal do usu�rio.
	 */
	public static void pesoIdeal() {
		
		//Pega as variaveis do teclado
		String sexo = Console.recuperaTexto("Digite o sexo M para masculino e F para feminino: ");
		double h = Console.recuperaDecimal("Digite a altura em metros: ");
		
		//Executa o c�lculo
		double pesoIdeal = Exercicios.pesoIdeal(sexo, h);
		
		//Printa na tela
		System.out.printf("O peso ideal � %.2f kg. \n\n", pesoIdeal);
	}
	
	/**
	 * Faz a execu��o de tela para c�lcular a equa��o do segundo grau.
	 */
	public static void equacao2Grau () {
		
		double a = Console.recuperaDecimal("Digite o valor de a: ");
		double b = Console.recuperaDecimal("Digite o valor de b: ");
		double c = Console.recuperaDecimal("Digite o valor de c: ");
		
		double[] raizes = Exercicios.calculoEquacao2Grau(a, b, c);
		
		if (raizes.length == 0) {
			
			System.out.printf("N�o existem ra�zes reais.\n\n");
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
	 * Faz a execu��o de tela para c�lculo do pre�o final de um produto.
	 */
	public static void valorFinalPago () {
		
		//Pega as variaveis do teclado
		double precoInicial = Console.recuperaDecimal("Digite o valor inicial do produto em reais: ");
		int metodoPagamento = Console.recuperaInteiro("Digite o m�todo de pagamento 1 2 3 ou 4: ");
		
		//Executa o c�lculo
		double precoFinal = Exercicios.valorFinalPago(precoInicial, metodoPagamento);
		
		//Printa na tela
		System.out.printf("O valor final do produto �: %.2f \n\n", precoFinal);
	}
	
	/**
	 * Faz a execu��o de tela para c�lculo entre dois n�meros dados pelo usu�rio de acordo com a op��o escolhida.
	 */
	public static void calculadora () {
		
		double primeiroNum = Console.recuperaDecimal("Digite o primeiro n�mero para o c�lculo: ");
		double segundoNum = Console.recuperaDecimal("Digite o segundo n�mero para o c�lculo: ");
		int operacao = Console.recuperaInteiro("Digite a opera��o desejada 1 a 4: ");
		
		double resposta = Exercicios.calculadora(primeiroNum, segundoNum, operacao);
		
		System.out.println("O resultado do c�lculo � " + resposta + "\n\n");
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
	 * Faz a execu��o de tela para o c�lculo do fatorial de um n�mero escolhido pelo usu�rio.
	 */
	public static void fatorial () {
		
		int numeroEscolhido = Console.recuperaInteiro("Digite um n�mero inteiro para o c�lculo: ");
		
		int result = Exercicios.fatorial(numeroEscolhido);
		
		System.out.println("O fatorial do n�mero escolhido � " + result + "\n\n");
	}
	
	/**
	 * Faz a execu��o de tela para a exibi��o de uma sequencia de n�meros de acordo com a escolha do usu�rio.
	 */
	public static void sequencia1 () {
		
		int numeroo = Console.recuperaInteiro("Digite o n�mero desejado ");
		
		Exercicios.sequencia1(numeroo);
		
		System.out.printf("\n\n");
	}
}
