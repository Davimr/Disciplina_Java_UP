package lista04;

/**
 * Representa a fila de atendimento de {@link Paciente}
 * 
 * @author DaviMR
 *
 */
public class Fila {
	
	private Nodo head;
	
	public Fila() {
	}
	
    public void enqueue (Paciente paciente) {
    	if (this.head == null) {
    		Nodo nodo = new Nodo(paciente);
    		this.head = nodo;
    	} else {
    		
    	}
    	
    }
    
    /**
     * Remove o primeiro elemento da fila
     * @return
     */
    public Paciente dequeue() {
    	if (this.head == null) {
    		return  null;
    	} else {
    		Paciente paciente = this.head.getPaciente();
    		this.head = this.head.getProximo();
    		return paciente;
    	}
    }
    
    @Override
    public String toString() {

    	return "";
    }
	
}

