package pessoal;

public class gerente extends funcionario {
	private int numFuncionarios;
	
	public gerente(String nome, String CPF, double salario, int numFuncionarios) {
		this.setNome(nome);
		this.setCPF(CPF);
		this.setSalario(salario);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public double getBonificacao() {
		return (this.getSalario() * 0.01) + (this.getSalario() * 0.15);
	}
}
