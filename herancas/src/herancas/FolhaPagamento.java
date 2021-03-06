package herancas;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe para representar uma folha de pagamentos de empregados.
 * 
 * @author DaviMR
 *
 */
public class FolhaPagamento {

	public static void imprimirFolhaEmpregados(ArrayList<Empregado> empregados) {
		
		Collections.sort(empregados, new ComparaPorSalario());
		
		for (Empregado empregado : empregados) {
			
			String nome = empregado.getNome();
			String matricula = empregado.getMatricula();
			Double ValorAPagar = empregado.getValorAPagar();
			System.out.println("Nome: " + nome + ", matricula: " + matricula 
					+ ", valor a pagar: " + ValorAPagar + ".");
		}
	}
}
