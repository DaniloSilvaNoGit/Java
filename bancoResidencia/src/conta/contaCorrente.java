package conta;

public class contaCorrente extends RConta {
	private double tarifa;
	private double limite;
	
	public contaCorrente() {
		
	}
	public contaCorrente(int numero, String nome, double saldo, double valor1, double valor2) {
		setNumeroConta(numero);
		setNome(nome);
		setSaldo(saldo);
		this.tarifa = valor1;
		this.limite = valor2;
	}
}
