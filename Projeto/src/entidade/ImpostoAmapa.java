package entidade;

/**
 * Classe para representar o imposto do amapa.
 * 
 * @author DaviMR
 *
 */
public class ImpostoAmapa extends Imposto{

	public ImpostoAmapa(Double valor) {
		super(valor);
	}
	
	static Double valorImposto = 0.215;
	
	public Double calcularImpostoEstadual() {
		return this.valor * valorImposto;
	}
}
