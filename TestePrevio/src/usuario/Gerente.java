package usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import applications.Menu;
import bancoEnum.CargoEnum;
import exceptions.ContaExceptions;
import contas.Conta;

public class Gerente extends Usuario{
	private int agencia; //indentificador
	private static String[] vetorCPF;
	private static String[] vetorAgencia;
	private static String[] vetorValor;
	private static String[] vetorSaldo;
	private static String[] vetorTempo;
	private static int qtdMovimentacao;
	// construtores
	public Gerente () {
		setCargo(CargoEnum.GERENTE.name());
	}
	
	public Gerente (String senha, String cpf, int agencia){
		setCpf(cpf);
		setSenha(senha);
		this.agencia = agencia;
		setCargo(CargoEnum.GERENTE.name());
	}
	
	//getter agencia
	public int getAgencia() {
		return agencia;
	}
}
