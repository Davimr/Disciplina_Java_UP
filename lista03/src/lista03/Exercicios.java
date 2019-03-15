package lista03;

/**
 * Classe para executar os exercícios da lista 03.
 * @author DaviMR
 */
public class Exercicios {

	/**
	 * Primeiro fator fixo para utilização no cálculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_1 = 72.7d;
	
	/**
	 * Segundo fator fixo para utilização no cálculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_2 = 58d;
	
	/**
	 * Primeiro fator fixo para utilização no cálculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_1 = 62.1d;
	
	/**
	 * Segundo fator fixo para utilização no cálculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_2 = 44.7d;
	
	/**
	 * Porcentagem aplicada em desconto no preço inicial do produto pago a vista em dinheiro ou cheque.
	 */
	public static final double PAGAMENTO_A_VISTA_DINHEIRO = 0.10d;
	
	/**
	 * Porcentagem aplicada em desconto no preço inicial do produto pago a vista no cartão de crédito.
	 */
	public static final double PAGAMENTO_A_VISTA_CREDITO = 0.05d;
	
	/**
	 * Porcentagem aplicada em acrescimo no preço incial do produto pago a prazo em 3 vezes.
	 */
	public static final double PAGAMENTO_A_PRAZO_3X = 0.10;
	
	/**
	 * Ex01 . Calcula o peso ideal do usuário baseado no sexo e na altura.
	 * @param sexo - M para masculino e F para feminino.
	 * @param altura - Altura em metros do usuário.
	 * @return - Peso ideal em Kg.
	 */
	public static double pesoIdeal (String sexo, double h) {
		
		double pesoIdeal = 0d;
		
		if (sexo.equalsIgnoreCase("M")) {
			
			pesoIdeal = (FATOR_MASCULINO_1 * h) - FATOR_MASCULINO_2;
		}
		
		if (sexo.equalsIgnoreCase("F")) {
			
			pesoIdeal = (FATOR_FEMININO_1 * h) - FATOR_FEMININO_2;
		}
		
		return pesoIdeal;
	}
	
	/**
	 * Ex02 . Faz o cálculo de Báskara para a equação do segundo grau.
	 * @param a - Termo em X ao quadrado.
	 * @param b - Termo em X.
	 * @param c - Termo em x elevado a zero.
	 * @return - Resultado do cálculo dentro de um vetor.
	 */
	public static double[] calculoEquacao2Grau (double a, double b, double c) {
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta < 0) {
			
			double[] vazio = {};
			return vazio;
		}
		
		if (delta == 0) {
			
			double raiz = -b / 2 * a;
			
			double[] umaRaiz = {raiz};
			return umaRaiz;
		}
		
		double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
		double[] raizes = {raiz1, raiz2};
		return raizes;
	}
	
	/**
	 * Ex03 . Calcula o valor final de um produto de acordo com a escolha do método de pagamento.
	 * @param precoInicial - Preço inicial do produto em Reais.
	 * @param metodoPagamento - Método de pagamento escolhido pelo usuário.
	 * @return - Valor final do produto.
	 */
	public static double valorFinalPago (double precoInicial, int metodoPagamento) {
		
		double precoFinal = 0d;
		
		switch (metodoPagamento) {
		case 1:
			precoFinal = precoInicial - (precoInicial * PAGAMENTO_A_VISTA_DINHEIRO);
			break;
		case 2:
			precoFinal = precoInicial - (precoInicial * PAGAMENTO_A_VISTA_CREDITO);
			break;
		case 3:
			precoFinal = precoInicial;
			break;
		case 4:
			precoFinal = precoInicial + (precoInicial * PAGAMENTO_A_PRAZO_3X);
			break;
		}
		
		return precoFinal;
	}
	
	/**
	 * Ex04 . Faz o cálculo entre dois numero informados pelo usuário de acordo com a operação desejada.
	 * @param primeiroNum - Primeiro número informado pelo usuário.
	 * @param segundoNum - Segundo número informado pelo usuário.
	 * @param operacao - Operação desejada para o cálculo enviada através de um inteiro de 1 a 4.
	 * @return - Resultado do cálculo.
	 */
	public static double calculadora(double primeiroNum, double segundoNum, int operacao) {
		
		double resposta = 0d;
		
		switch (operacao) {
		case 1:
			resposta = primeiroNum + segundoNum;
			break;
		case 2:
			resposta = primeiroNum - segundoNum;
			break;
		case 3:
			resposta = primeiroNum * segundoNum;
			break;
		case 4:
			resposta = primeiroNum / segundoNum;
			break;
		}
		
		return resposta;
	}
	
	/**
	 * Ex05 . Testa três pontos do plano cartesiano e indica se os mesmos formam um triângulo.
	 * @param x1 - Primeiro ponto lado 1.
	 * @param x2 - Primeiro ponto lado 2.
	 * @param y1 - Segundo ponto lado 1.
	 * @param y2 - Segundo ponto lado 2.
	 * @param z1 - Terceiro ponto lado 1.
	 * @param z2 - Terceiro ponto lado 2.
	 * @return - Retorna se os pontos indicados formam um triângulo e o seu tipo.
	 */
	public static String testeTriangulo (int x1, int x2, int y1, int y2, int z1, int z2) {
		
		double lado1Lado2 = Console.distanciaEntre2Pontos(x1, x2, y1, y2);
		
		double lado1Lado3 = Console.distanciaEntre2Pontos(x1, x2, z1, z2);
		
		double lado2Lado3 = Console.distanciaEntre2Pontos(y1, y2, z1, z2);
		
		String tipo_triangulo;
		
		boolean teste = false;
		
		if (lado1Lado2 < (lado1Lado3 + lado2Lado3)) {
			
			if (lado1Lado3 < (lado1Lado2 + lado2Lado3)) {
				
				if (lado2Lado3 < (lado1Lado2 + lado1Lado3)) {
					
					teste = true;
				}
			}
		}
		
		if (teste == true) {
		
			if (lado1Lado2 != lado2Lado3) {
				
				if (lado1Lado2 != lado1Lado3) {
					
					if (lado1Lado3 != lado2Lado3) {
						
						tipo_triangulo = "Triângulo escaleno.";
						return tipo_triangulo;
					}	
				}
			}
			
			if (lado1Lado2 == lado2Lado3) {
				
				if (lado1Lado2 == lado1Lado3) {
					
					if (lado1Lado3 == lado2Lado3) {
						
						tipo_triangulo = "Triângulo eqüilátero.";
						return tipo_triangulo;
					}
				}
			}
			
			tipo_triangulo = "Triângulo isóceles.";
			return tipo_triangulo;
		} 
		else {
			
			tipo_triangulo = "Não formam triângulo";
			return tipo_triangulo;
		}
	}
	
	/**
	 * Ex06 . Faz o cálculo do fatorial de um número inteiro selecionado pelo usuário.
	 * @param numeroEscolhido - Número inteiro escolhido pelo usuário.
	 * @return - Fatorial do número selecionado pelo usuário.
	 */
	public static int fatorial (int numeroEscolhido) {
		
		int result = 0;
		
		int i = 0;
		
		for (i = 0; i <= numeroEscolhido; i++) {
			
			result = i * i+1;
		}
		
		return result;
	}
	
	/**
	 * Ex11 . Apresenta os números em sequência de acordo com o número desejado pelo usuário.
	 * @param numeroo - Número inteiro escolhido pelo usuário.
	 */
	public static void sequencia1 (int numeroo) {
		
		int i = 0;
		
		int x = 0;
		
		for (i = 1; i <= numeroo; i++) {
			
			for (x = 0; x < i; x++) {
				
				System.out.printf("%d ", i);
			}
		}
	}
	


	
}
