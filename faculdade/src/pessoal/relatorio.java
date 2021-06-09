package pessoal;

public class relatorio extends professores {
	public void getRelatorio() {
		System.out.println(
				"=============================================================\n" +
				"|Tabela de gastos da faculdade                              |" +                           
				"\n=============================================================\n" +
				"Quantidade de funcionarios: " + empregados.numFuncionarios +
				"\nGastos gerais da faculdade: " + empregados.gastosFacul
				);
	}
}
