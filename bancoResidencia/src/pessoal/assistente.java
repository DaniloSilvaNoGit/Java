package pessoal;

public class assistente extends funcionario {
	private String funcionarioAssistido;
	
	public assistente(String nome, String CPF, double salario, String funcionarioAssistido) {
		this.setCPF(CPF);
		this.setNome(nome);
		this.setSalario(salario);
		this.funcionarioAssistido = funcionarioAssistido;
	}

	public String getFuncionarioAssistido() {
		return funcionarioAssistido;
	}
	public void setFuncionarioAssistido(String funcionarioAssistido) {
		this.funcionarioAssistido = funcionarioAssistido;
	}
	public double getBonificacao() {
		return this.getSalario() * 0.10;
	}
}
