package br.edu.web;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.lista01.Exercicios;

/**
 * Calculo de distancia entre dois pontos
 * 
 * @author DaviMR
 *
 */
@Named
@RequestScoped
public class DistanciaBean {
	
	@NotNull
	private Integer x1;
	
	@NotNull
	private Integer x2;
	
	@NotNull
	private Integer y1;
	
	@NotNull
	private Integer y2;
	
	private Double distancia;
	
	public void calcular() {
		
		this.distancia = Exercicios.calcularDistanciaEntrePontos(x1, y1, x2, y2);
	}
	
	public void calcularComMensagem() {
		
		this.calcular();
		
		FacesMessage message = new FacesMessage();
		message.setSummary("O resultado é: " + this.distancia);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Integer getX1() {
		return x1;
	}

	public void setX1(Integer x1) {
		this.x1 = x1;
	}

	public Integer getX2() {
		return x2;
	}

	public void setX2(Integer x2) {
		this.x2 = x2;
	}

	public Integer getY1() {
		return y1;
	}

	public void setY1(Integer y1) {
		this.y1 = y1;
	}

	public Integer getY2() {
		return y2;
	}

	public void setY2(Integer y2) {
		this.y2 = y2;
	}

	public Double getDistancia() {
		return distancia;
	}

	
	
}
