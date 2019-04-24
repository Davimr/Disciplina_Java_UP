package entidade;

import java.util.Date;

public class NotaFiscal implements Comparable <NotaFiscal> {

	private String numero;
	
	private String descricao;
	
	private Date dataEmissao;
	
	private Imposto imposto;
	
	private Double valor;
	
	private Double valorComImposto;
	
	private boolean cancelada;
	
	public NotaFiscal(String numero, String descricao, Imposto imposto, Double valor) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.imposto = imposto;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void compareTo() {
		// TODO Auto-generated method stub
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValorComImposto() {
		return valorComImposto;
	}

	public void setValorComImposto(Double valorComImposto) {
		this.valorComImposto = valorComImposto;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	@Override
	public int compareTo(NotaFiscal arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
