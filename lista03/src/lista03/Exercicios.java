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
}
