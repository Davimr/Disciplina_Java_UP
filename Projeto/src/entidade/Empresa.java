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
	
	private ArrayList<NotaFiscal> notasFiscais;

	public Empresa(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public ArrayList<NotaFiscal> getNotasFiscaisValidas() {
		
		return null;
	}
	
	public ArrayList<NotaFiscal> getNotasFiscaisCanceladas() {
		
		return null;
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
	
	
	
	

}
