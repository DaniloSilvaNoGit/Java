package pessoal;

public abstract class funcionario {
	private String nome;
	private String CPF;
	private double salario;
	public static int quantidadeFuncionarios;
	// Get e Set nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	// Get e set CPF
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {
		return this.CPF;
	}
	// Get e set salario
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	// Construtor default funcionario
	public funcionario() {
		quantidadeFuncionarios++;
	}
	// Bonificação
	public abstract double getBonificacao();
}
