package entidade;

import java.util.ArrayList;

/**
 * Classe para realizar a soma do valor das notas fiscais de uma empresa sem impostos.
 * 
 * @author DaviMR
 *
 */
public class Faturamento {
	
	public static Double calcFaturamento (ArrayList<NotaFiscal> notas) {
		
		Double soma = 0d;
		
		for (NotaFiscal notaFiscal : notas) {
			
			soma = soma + notaFiscal.getValor();
		}
		
		return soma;
	}

}
