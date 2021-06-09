package principal;
import conta.RConta;
import pessoal.gerente;
import pessoal.assistente;
import pessoal.diretor;
import pessoal.operadorCaixa;
import pessoal.funcionario;

public class RPrincipal {
	public static void main(String[] args) {
//		Criação das contas
//		RConta conta = new RConta();
//		conta.setNome("Danilo");
//		conta.setNumeroConta(1);
//		conta.setSaldo(100.00);
//		RConta conta1 = new RConta();
//		conta1.setNome("Granato");
//		conta1.setNumeroConta(2);
//		conta1.setSaldo(200.00);	
//		Execução de sacarDinheiro
//		conta1.sacarDinheiro(50);	
//		Execução de depositarDinheiro
//		conta.depositarDinheiro(200);	
//		Execução de transferencia
//		conta.transferirDinheiro(50,conta1);	
//		Execução dos construtores
//		RConta c3 = new RConta();
//		System.out.println(
//				"Numero da Conta: " + c3.getNumeroConta() + 
//				" Nome do portador: " + c3.getNome() +
//				" Saldo da conta: " + c3.getSaldo()
//				);
//		Sobrecarga com nome e numero da conta
//		RConta c4 = new RConta(3, "Fred");
//		System.out.println(
//				"Numero da Conta: " + c4.getNumeroConta() + 
//				" Nome do portador: " + c4.getNome() +
//				" Saldo da conta: " + c4.getSaldo()
//				);
//		Sobrecarga com nome, numero e saldo
//		RConta c5 = new RConta(4, "Lucas", 10000000);
//		System.out.println(
//				"Numero da Conta: " + c5.getNumeroConta() + 
//				" Nome do portador: " + c5.getNome() +
//				" Saldo da conta: " + c5.getSaldo()
//				);
//		contaPoupanca conta6 = new contaPoupanca(6,"Zé",10000,10);
//		Execução dos construtores de funcionarios especializados
		gerente g1 = new gerente("Granato","12345678910",1000,10);
		System.out.println( 
				g1.getNome() + " " + 
				g1.getCPF() + " " + 
				g1.getSalario() + " " +
				g1.getNumFuncionarios() 
				);
		
//		diretor d1 = new diretor("Fred","12345678911",100000,25.5);
//		System.out.println(
//				d1.getNome() + " " +
//				d1.getCPF() + " " +
//				d1.getSalario() + " " +
//				d1.getPartcipacaoLucro()
//				);
		
		operadorCaixa op1 = new operadorCaixa("Danilo","12345678912",1000,4);
		System.out.println(
				op1.getNome() + " " +
				op1.getCPF() + " " +
				op1.getSalario() + " " +
				op1.getTerminalCaixa()
				);
//		
//		assistente a1 = new assistente("Lucas","12345678913",10000,"Granato");
//		System.out.println(
//				a1.getNome() + " " +
//				a1.getCPF() + " " +
//				a1.getSalario() + " " +
//				a1.getFuncionarioAssistido()
//				);
		
//		System.out.println("Quantidade de funcionario: " + funcionario.quantidadeFuncionarios);
		
		System.out.println(g1.getBonificacao(g1));
		System.out.println((g1.getBonificacao(g1) + g1.getSalario()));
	}
}
