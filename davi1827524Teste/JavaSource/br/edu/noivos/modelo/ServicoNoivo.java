package br.edu.noivos.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.noivos.entidade.copy.copy.Noivo;

@Stateless
public class ServicoNoivo {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarNoivo(Noivo noivo) {
		this.em.persist(noivo);
	}
	
	public List<Noivo> Listar(){
		return this.em.createQuery("SELECT v FROM Noivo v", Noivo.class).getResultList();
	}
	
	public void excluirNoivo(Noivo noivo) {
		this.em.remove(this.em.merge(noivo));
	}
	
	

}
