package lista04;

/**
 * Representa uma posição na fila
 * 
 * @author DaviMR
 *
 */
public class Nodo {
	
	private Paciente paciente;
	
	private Nodo proximo;
	
	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}

	public Nodo(Paciente paciente) {
		this.paciente = paciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}


	
	

}
