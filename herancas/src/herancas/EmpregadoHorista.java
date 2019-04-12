package herancas;

import java.util.Date;

/**
 * Classe para representar um empregado horista.
 * 
 * @author DaviMR
 *
 */
public class EmpregadoHorista extends Empregado {
	
	

	public EmpregadoHorista(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salarioPorHora, Integer quantidadeHoras) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);

		this.salarioPorHora = salarioPorHora;
		this.quantidadeHoras = quantidadeHoras;
		
	}

	public Double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(Double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	private Double salarioPorHora;
	
	private Integer quantidadeHoras;
	
	@Override
		public Double getValorAPagar() {
			return this.salarioPorHora * this.quantidadeHoras;
		}

}
