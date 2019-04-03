package lista04;

import java.util.ArrayList;

/**
 * Classe para representar um paciente.
 * 
 * @author DaviMR
 *
 */
public class Paciente {
	
	private String codigo;
	
	private String nome;
	
	private ArrayList<String> doencas;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<String> getHistorico() {
		return this.doencas;
	}

	public void addHistorico (String doenca) {
		
	}
	

}
