package entidade;

/**
 * Classe para representar imposto.
 * 
 * @author DaviMR
 *
 */
public abstract class Imposto {
	
	private Double aliquotaFederal;
	
	protected Double valor;

	public Imposto(Double valor) {
		super();
		this.valor = valor;
	}
	
	public Double calcularImpostoTotal() {
		
		return 0d;
	}
	
	public Double calcularImpostoFederal() {
		
		return 0d;
	}
	
	public abstract Double calcularImpostoEstadual();
	

}
