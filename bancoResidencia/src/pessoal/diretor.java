package pessoal;

public class diretor extends funcionario {
	private double partcipacaoLucro;
	
	public diretor(String nome, String CPF, double salario, double partcipacaoLucro) {
		this.setCPF(CPF);
		this.setSalario(salario);
		this.partcipacaoLucro = partcipacaoLucro;
		this.setNome(nome);
	}

	public double getPartcipacaoLucro() {
		return partcipacaoLucro;
	}
	public void setPartcipacaoLucro(double partcipacaoLucro) {
		this.partcipacaoLucro = partcipacaoLucro;
	}
	public double getBonificacao() {
		return this.getSalario() * 0.10;
	}
}
