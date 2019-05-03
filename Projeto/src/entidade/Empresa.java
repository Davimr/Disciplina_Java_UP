package entidade;

import java.util.ArrayList;

/**
 * Classe para representar uma empresa.
 * 
 * @author DaviMR
 *
 */
public class Empresa {
	
	private String nome;
	
	private String cnpj;
	
	private ArrayList<NotaFiscal> notasFiscais = new ArrayList<>();
	
	private ArrayList<NotaFiscal> notasFiscaisCanceladas = new ArrayList<>();
	
	public Empresa(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public ArrayList<NotaFiscal> getNotasFiscais() {
		return this.notasFiscais;
	}
	
	public ArrayList<NotaFiscal> getNotasFiscaisCanceladas() {
		
		for (NotaFiscal notaFiscal : this.notasFiscais) {
			if (notaFiscal.isCancelada()) {
				this.notasFiscaisCanceladas.add(notaFiscal);
			}
		}
	
		return this.notasFiscaisCanceladas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void addNota (NotaFiscal nota) {
		this.notasFiscais.add(nota);
	}

	@Override
		public String toString() {
			return "Nome: " + this.nome + "\nCNPJ: " + this.cnpj + "\n";
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}
	
	
}
