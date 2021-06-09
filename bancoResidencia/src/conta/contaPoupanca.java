package conta;

public class contaPoupanca extends RConta {
	private double rendimento;
	
	public contaPoupanca() {
		
	}
	public contaPoupanca(int numero, String nome, double saldo, double valor) {
		setNumeroConta(numero);
		setNome(nome);
		setSaldo(saldo);
		this.rendimento = valor;
		System.out.println(
				getNumeroConta() + " " + getNome() + " " + getSaldo() + 
				" " + this.rendimento 
				);
	}
}