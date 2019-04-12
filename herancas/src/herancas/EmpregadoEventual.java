package herancas;

import java.util.Date;

/**
 * Classe para representar um empregado eventual.
 * 
 * @author DaviMR
 *
 */
public class EmpregadoEventual extends Empregado {
	
	public EmpregadoEventual(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double valorContratado) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		
		this.valorContratado = valorContratado;
	}

	public Double getValorContrato() {
		return valorContratado;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContratado = valorContrato;
	}

	private Double valorContratado;

	@Override
		public Double getValorAPagar() {
			return this.valorContratado;
		}
}
