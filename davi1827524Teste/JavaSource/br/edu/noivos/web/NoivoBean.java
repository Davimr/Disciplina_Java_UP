package br.edu.noivos.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.noivos.entidade.copy.copy.Noivo;
import br.edu.noivos.modelo.ServicoNoivo;

@Named
@RequestScoped
public class NoivoBean {
	
	private Noivo noivo;
	
	@EJB
	private ServicoNoivo serviconoivo;
	
	public NoivoBean() {
		this.noivo = new Noivo();
	}
	
	public void salvarNoivo() {
		this.serviconoivo.cadastrarNoivo(this.noivo);
		
	}
	
	public List<Noivo> ListarNoivos(){
		return this.serviconoivo.Listar();
	}
	
	public void excluirNoivo() {
		this.serviconoivo.excluirNoivo(noivo);
	}
	
	public Noivo getNoivo() {
		return noivo;
	}
	
	public void setNoivo(Noivo noivo) {
		this.noivo = noivo;
	}
	

}
