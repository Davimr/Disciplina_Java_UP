package entidade;

/**
 * Classe para representar o importo do Parana.
 * 
 * @author DaviMR
 *
 */
public class ImpostoSaoPaulo extends Imposto{

	public ImpostoSaoPaulo(Double valor) {
		super(valor);
	}
	
	static Double valorImposto = 0.18;
	
	public Double calcularImpostoEstadual() {
		return this.valor * valorImposto;
	}
	
	

}
