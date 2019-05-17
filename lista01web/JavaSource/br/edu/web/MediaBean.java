package br.edu.web;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.lista01.Exercicios;

/**
 * Calculo da media aritmetica
 * 
 * @author Davimr
 *
 */
@Named
@RequestScoped
public class MediaBean {
	
	@NotNull
	private Double nota1;
	
	@NotNull
	private Double nota2;
	
	@NotNull
	private Double nota3;
	
	private Double media;
	
	public void calcular() {
		
		this.media = Exercicios.mediaAritmetica(nota1, nota2, nota3);
	}
	
	public void calcularComMensagem() {
		
		this.calcular();
		
		FacesMessage message = new FacesMessage();
		message.setSummary("O resultado é: " + this.media);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getMedia() {
		return media;
	}
	
	

}
