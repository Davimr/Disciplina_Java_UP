package entidade;

/**
 * Classe para representar imposto.
 * 
 * @author DaviMR
 *
 */
public abstract class Imposto {
	
	static private Double aliquotaFederal = 0.15;
	
	protected Double valor;
	
	public Imposto(Double valor) {
		this.valor = valor;
	}

	public Double calcularImpostoTotal() {
		return this.valor + calcularImpostoEstadual() + calcularImpostoFederal();
	}
	
	public Double calcularImpostoFederal() {
		return this.valor * aliquotaFederal;
	}
	
	public abstract Double calcularImpostoEstadual();
	

}
