package br.edu.web;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.lista01.Exercicios;

/**
 * Calculo da progressao aritmetica
 * 
 * @author DaviMR
 *
 */
@Named
@RequestScoped
public class ProgressaoBean {
	
	@NotNull
	private Double a1;
	
	@NotNull
	private Integer n;
	
	@NotNull
	private Double r;
	
	private Double an;
	
	public void calcular() {
		
		this.an = Exercicios.calcularNEsimoTermo(a1, n, r);
	}
	
	public void calcularComMensagem() {
		
		this.calcular();
		
		FacesMessage message = new FacesMessage();
		message.setSummary("O resultado é: " + this.an);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Double getA1() {
		return a1;
	}

	public void setA1(Double a1) {
		this.a1 = a1;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

	public Double getAn() {
		return an;
	}
	
}
