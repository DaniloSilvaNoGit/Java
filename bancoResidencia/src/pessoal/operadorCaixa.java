package pessoal;

public class operadorCaixa extends funcionario {
	private int terminalCaixa;
	
	public operadorCaixa(String nome, String CPF, double salario, int terminalCaixa) {
		this.setCPF(CPF);
		this.setNome(nome);
		this.setSalario(salario);
		this.terminalCaixa = terminalCaixa;
	}

	public int getTerminalCaixa() {
		return terminalCaixa;
	}
	public void setTerminalCaixa(int terminalCaixa) {
		this.terminalCaixa = terminalCaixa;
	}
	public double getBonificacao() {
		return this.getSalario() * 0.10;
	}
}
