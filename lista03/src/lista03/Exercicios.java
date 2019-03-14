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
	 * Ex03 . Calcula o valor final de um produto de acordo com a escolha do método de pagamento.
	 * @param precoInicial - Preço inicial do produto em Reais.
	 * @param metodoPagamento - Método de pagamento escolhido pelo usuário.
	 * @return - Valor final do produto.
	 */
	public static double valorFinalPago (double precoInicial, int metodoPagamento) {
		
		double precoFinal = 0;
		
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
}
