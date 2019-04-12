package herancas;

import java.util.ArrayList;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Empregado> empregados = new ArrayList<>();
		
		EmpregadoMensal lidia = new EmpregadoMensal("Lidia", new Date(), "lidia@up.com",
				"41 88445555", new Date(), null, "222456", 8560.23d);
		
		EmpregadoHorista carlos = new EmpregadoHorista("Carlos", new Date(), "carlos@cc.com", "42 88774444",
				new Date(), null, "84735", 75.89d, 150);
		
		empregados.add(lidia);
		
		empregados.add(carlos);
		
		FolhaPagamento.imprimirFolhaEmpregados(empregados);
	}
}
