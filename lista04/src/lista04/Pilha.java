package lista04;

import java.util.ArrayList;

/**
 * Representa uma pilha de {@link Livro}
 * 
 * @author DaviMR
 *
 */
public class Pilha {
	
	/**
	 * Representa a Pilha.
	 */
	private ArrayList<Livro> pilhaDeLivros; 
	
	/**
	 * Quantia máxima de {@link Livro}
	 */
	private Integer topo;
	
	public Pilha() {
		this.topo = 5;
		this.pilhaDeLivros = new ArrayList<>();
	}
	
	/**
	 * Verifica se a pilha está cheia
	 * @return
	 */
	public boolean cheia() {
		return this.topo == this.pilhaDeLivros.size();
	}
	
	/**
	 * Verifica se a pilha está vazia
	 * @return
	 */
	public boolean vazia() {
		return this.pilhaDeLivros.size() == 0;
	}
	
	/**
	 * Adiciona um livro na pilha, se a mesma não estiver cheia
	 * @param livro
	 */
	public void push(Livro livro) {
		if ( !cheia() ) {
		this.pilhaDeLivros.add(livro);
		}
	}
	
	/**
	 * Remove e retorna o último livro da pilha
	 * @return
	 */
	public Livro pop() {
		if (vazia() ) {
			return null;
		} else {
			return this.pilhaDeLivros.remove(this.pilhaDeLivros.size() - 1);
		}
	}
	
	/**
	 * Retorna o livro do topo da pilha
	 * @return
	 */
	public Livro peek() {
		if (vazia() ) {
			return null;
		} else {
			return this.pilhaDeLivros.get(pilhaDeLivros.size() - 1);
		}
	}
	
	@Override
	public String toString() {
		String retorno = "";
		for (int i = this.pilhaDeLivros.size() - 1; i >= 0; i--) {
			retorno += this.pilhaDeLivros.get(i) + "\n\n";
		}
		return retorno;
	}
	

}
