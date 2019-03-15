package lista03;

/**
 * Classe para executar os exerc�cios da lista 03.
 * @author DaviMR
 */
public class Exercicios {

	/**
	 * Primeiro fator fixo para utiliza��o no c�lculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_1 = 72.7d;
	
	/**
	 * Segundo fator fixo para utiliza��o no c�lculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_2 = 58d;
	
	/**
	 * Primeiro fator fixo para utiliza��o no c�lculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_1 = 62.1d;
	
	/**
	 * Segundo fator fixo para utiliza��o no c�lculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_2 = 44.7d;
	
	/**
	 * Porcentagem aplicada em desconto no pre�o inicial do produto pago a vista em dinheiro ou cheque.
	 */
	public static final double PAGAMENTO_A_VISTA_DINHEIRO = 0.10d;
	
	/**
	 * Porcentagem aplicada em desconto no pre�o inicial do produto pago a vista no cart�o de cr�dito.
	 */
	public static final double PAGAMENTO_A_VISTA_CREDITO = 0.05d;
	
	/**
	 * Porcentagem aplicada em acrescimo no pre�o incial do produto pago a prazo em 3 vezes.
	 */
	public static final double PAGAMENTO_A_PRAZO_3X = 0.10;
	
	/**
	 * Ex01 . Calcula o peso ideal do usu�rio baseado no sexo e na altura.
	 * @param sexo - M para masculino e F para feminino.
	 * @param altura - Altura em metros do usu�rio.
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
	 * Ex02 . Faz o c�lculo de B�skara para a equa��o do segundo grau.
	 * @param a - Termo em X ao quadrado.
	 * @param b - Termo em X.
	 * @param c - Termo em x elevado a zero.
	 * @return - Resultado do c�lculo dentro de um vetor.
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
	 * Ex03 . Calcula o valor final de um produto de acordo com a escolha do m�todo de pagamento.
	 * @param precoInicial - Pre�o inicial do produto em Reais.
	 * @param metodoPagamento - M�todo de pagamento escolhido pelo usu�rio.
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
	 * Ex04 . Faz o c�lculo entre dois numero informados pelo usu�rio de acordo com a opera��o desejada.
	 * @param primeiroNum - Primeiro n�mero informado pelo usu�rio.
	 * @param segundoNum - Segundo n�mero informado pelo usu�rio.
	 * @param operacao - Opera��o desejada para o c�lculo enviada atrav�s de um inteiro de 1 a 4.
	 * @return - Resultado do c�lculo.
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
	 * Ex05 . Testa tr�s pontos do plano cartesiano e indica se os mesmos formam um tri�ngulo.
	 * @param x1 - Primeiro ponto lado 1.
	 * @param x2 - Primeiro ponto lado 2.
	 * @param y1 - Segundo ponto lado 1.
	 * @param y2 - Segundo ponto lado 2.
	 * @param z1 - Terceiro ponto lado 1.
	 * @param z2 - Terceiro ponto lado 2.
	 * @return - Retorna se os pontos indicados formam um tri�ngulo e o seu tipo.
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
						
						tipo_triangulo = "Tri�ngulo escaleno.";
						return tipo_triangulo;
					}	
				}
			}
			
			if (lado1Lado2 == lado2Lado3) {
				
				if (lado1Lado2 == lado1Lado3) {
					
					if (lado1Lado3 == lado2Lado3) {
						
						tipo_triangulo = "Tri�ngulo eq�il�tero.";
						return tipo_triangulo;
					}
				}
			}
			
			tipo_triangulo = "Tri�ngulo is�celes.";
			return tipo_triangulo;
		} 
		else {
			
			tipo_triangulo = "N�o formam tri�ngulo";
			return tipo_triangulo;
		}
	}
	
	/**
	 * Ex06 . Faz o c�lculo do fatorial de um n�mero inteiro selecionado pelo usu�rio.
	 * @param numeroEscolhido - N�mero inteiro escolhido pelo usu�rio.
	 * @return - Fatorial do n�mero selecionado pelo usu�rio.
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
	 * Ex11 . Apresenta os n�meros em sequ�ncia de acordo com o n�mero desejado pelo usu�rio.
	 * @param numeroo - N�mero inteiro escolhido pelo usu�rio.
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
