package entidade;

/**
 * Classe para representar o importo do Parana.
 * 
 * @author DaviMR
 *
 */
public class ImpostoSantaCatarina extends Imposto{

	public ImpostoSantaCatarina(Double valor) {
		super(valor);
	}
	
	static Double valorImposto = 0.1;
	
	public Double calcularImpostoEstadual() {
		return this.valor * valorImposto;
	}
	
	

}
