package br.edu.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import entidade.CalculoPA;

/**
 * Calculo da progressao aritmetica
 * 
 * @author DaviMR
 *
 */
@Named
@RequestScoped
public class ProgressaoBean {
	
	private CalculoPA calculoPA;
	
	private ArrayList<CalculoPA> calculos;
	
	public ProgressaoBean() {
		this.calculoPA = new CalculoPA();
		this.calculos = new ArrayList<CalculoPA>();
	}
	
	public void calcularComMensagem() {
		
		calculoPA.calcularNEsimoTermo();
		this.calculos.add(this.calculoPA);
		
		FacesMessage message = new FacesMessage();
		message.setSummary("O resultado é: " + this.calculoPA.getAn());
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		this.calculoPA = new CalculoPA();
	}

	public CalculoPA getCalculoPA() {
		return calculoPA;
	}

	public void setCalculoPA(CalculoPA calculoPA) {
		this.calculoPA = calculoPA;
	}

	public ArrayList<CalculoPA> getCalculos() {
		return calculos;
	}

	public void setCalculos(ArrayList<CalculoPA> calculos) {
		this.calculos = calculos;
	}
	
}
