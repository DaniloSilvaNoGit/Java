package conta;

public  class RConta {
	private String nome;
	private int numeroConta;
	private double saldo;
	
	// Get e set nome
	public String getNome() {
		return nome;
	}
	public void setNome(String info) {
		nome = info;
	}
	
	// Get e set numeroConta
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int info) {
		numeroConta = info;
	}
	
	// Get e set saldo
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double info) {
		saldo = info;
	}
	
	// Definição do saque
	public void sacarDinheiro(double valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente para este saque.");
		}
		else {
			System.out.println("O processo de saque foi realizado com sucesso.");
			this.saldo = this.saldo - valor;
			System.out.println("Saldo atual " + this.saldo);
		}
	}
	
	// Definição do metodo de deposito
	public void depositarDinheiro(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Deposito realizado com sucesso!\nSaldo Atual " + this.saldo);
	}
	
	// Definição do metodo transferir
	public void transferirDinheiro(double valor, RConta recebedor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente para realizar esta transferencia.");
		}
		else {
			this.saldo = this.saldo - valor;
			recebedor.saldo = recebedor.saldo + valor;
			System.out.println("Novo valor do recebedor: " + recebedor.saldo);
			System.out.println("Novo valor do pagador: " + this.saldo);
		}
	}
	
	// Criação de construtores 
	public RConta() {
		
	}
	public RConta(int numero,String nome) {
		this.numeroConta = numero;
		this.nome = nome;
	}
	public RConta(int numero,String nome,double saldo) {
		this.numeroConta = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
}