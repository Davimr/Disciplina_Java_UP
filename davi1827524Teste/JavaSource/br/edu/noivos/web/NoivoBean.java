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
	
	private List<Noivo> noivos;
	
	@EJB
	private ServicoNoivo serviconoivo;
	
	public NoivoBean() {
		this.noivo = new Noivo();
	}
	
	public void salvarNoivo() {
		this.serviconoivo.cadastrarNoivo(this.noivo);
		noivo = new Noivo();
		
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

	public List<Noivo> getNoivos() {
		return noivos = serviconoivo.Listar();
	}

	public void setNoivos(List<Noivo> noivos) {
		this.noivos = noivos;
	}
	

}
