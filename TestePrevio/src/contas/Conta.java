package contas;

import exceptions.ContaExceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import applications.Menu;
import escritorLeitor.EscritorLeitor;
import usuario.Gerente;

public abstract class Conta {
	
	protected String cpf;
	protected double saldo;
	protected int agencia;//indentificador
	private static int qtdMovimentacao = 0;
	private static String vetorTipoDaMovimentacao[] = new String[qtdMovimentacao+1];
	private static String vetorCPF[] = new String[qtdMovimentacao+1];
	private static String vetorAgencia[] = new String[qtdMovimentacao+1];
	private static String vetorValor[] = new String[qtdMovimentacao+1];
	private static String vetorSaldo[] = new String[qtdMovimentacao+1];
	private static String vetorTempo[] = new String[qtdMovimentacao+1];
	
	//função para depositar "valor" dentro do "saldo" da conta chamada
	public void depositar (double valor) throws ContaExceptions {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); 
		if(valor <= 0) {
			 throw new ContaExceptions(Menu.erroMenu() + "Valor de deposito menor ou igual a 0\n");
		} else {
			System.out.printf("\nO saldo era: R$%.2f\n",this.saldo);	
			System.out.printf("O custo da movimentação é: R$0,10\n");
			System.out.printf("O valor depositado foi de: R$%.2f\n",valor);
			this.saldo = this.saldo+valor-0.10;
			System.out.printf("O novo saldo é: R$%.2f\n",this.saldo);
			// Tipo da movimentação para que possamos exibir de forma especifica o estrato. 1 referencia a um deposito.
			vetorTipoDaMovimentacao[qtdMovimentacao] = "1";
			vetorCPF[qtdMovimentacao] = this.getCpf();
			vetorAgencia[qtdMovimentacao] = (String.valueOf(this.getAgencia())) ;
			vetorValor[qtdMovimentacao] = (String.valueOf(valor));
			vetorSaldo[qtdMovimentacao] = (String.valueOf(this.getSaldo())); 
			vetorTempo[qtdMovimentacao] = LocalDateTime.now().format(formatter);
			qtdMovimentacao++;
		}
	}
	
	public void setSalario(double salario) {
		this.saldo = salario; 
	}
	
	public static String getVetorTipoDaMovimetacao(int onde) {
		return vetorTipoDaMovimentacao[onde];
	}
	public static String getVetorTempo(int onde) {
		return vetorTempo[onde];
	}

	public static int getQtdMovimentacao() {
		return qtdMovimentacao;
	}

	public static String getVetorCPF(int onde) {
		return vetorCPF[onde];
	}

	public static String getVetorAgencia(int onde) {
		return vetorAgencia[onde];
	}

	public static String getVetorValor(int onde) {
		return vetorValor[onde];
	}

	public static String getVetorSaldo(int onde) {
		return vetorSaldo[onde];
	}

	//função para sacar "valor" de dentro do "saldo" da conta chamada
	public boolean sacar (double valor) throws ContaExceptions {
		if (this.saldo<valor) {
			System.out.println("O valor requerido é maior que o saldo atual (" + this.saldo + 
					") da conta.");
			return false;
		}else {
			this.saldo = this.saldo-valor;
			return true;
		}
	}	
	
	//função para tranferir "valor" de dentro do "saldo" da conta chamada
	//para uma conta destino
	public void transfere (double valorTransfere, Conta contaDestino) {
		if (this.sacar(valorTransfere) == true) {
			contaDestino.depositar(valorTransfere);
			System.out.println("O valor "+ valorTransfere + " foi transferido!");
		}
	}
	
	//get do "saldo".
	//Não tem setter pq o saldo só muda com depositos, saques e transferencias
	public double getSaldo() {
		return saldo;
	}
	
	//get e setter do "cpf"
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//get e setter da "agencia"
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}
