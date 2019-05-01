package entidade;

/**
 * Classe para representar o importo do Parana.
 * 
 * @author DaviMR
 *
 */
public class ImpostoParana extends Imposto{

	public ImpostoParana(Double valor) {
		super(valor);
	}
	
	static Double valorImposto = 0.05;
	
	public Double calcularImpostoEstadual() {
		return this.valor * valorImposto;
	}
	
	

}
