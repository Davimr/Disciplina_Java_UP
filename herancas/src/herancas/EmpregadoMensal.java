package herancas;

import java.util.Date;

/**
 * Classe para representar um empregado mensal.
 * 
 * @author DaviMR
 *
 */
public class EmpregadoMensal extends Empregado {
	
	public EmpregadoMensal(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salario) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	private Double salario;
	
	@Override
		public Double getValorAPagar() {
			return this.salario;
		}

}
