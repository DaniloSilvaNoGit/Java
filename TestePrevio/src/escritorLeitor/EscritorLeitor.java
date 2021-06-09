package escritorLeitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import applications.Menu;
import contas.Conta;

public class EscritorLeitor {
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static DateTimeFormatter Format = DateTimeFormatter.ofPattern("ddMMyyyyss");
    static String dateString = LocalDateTime.now().format(Format);
	public static void escritorMovimentacoes() throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH_BASICO+dateString+EXTENSAO));
		escritor.append(Menu.logo()+"\n");
		for(int i = 0;i < Conta.getQtdMovimentacao();i++) {
			// Isso significa que a movimentação realizada foi um deposito
			if(Conta.getVetorTipoDaMovimetacao(i).equals("1")) {
				escritor.append("================Registro de Deposito================\n");
				escritor.append("Realizador do deposito: "+Conta.getVetorCPF(i)+"\n");
				escritor.append("Agência utilizada: "+Conta.getVetorAgencia(i)+"\n");
				escritor.append("Valor depositado: "+Conta.getVetorValor(i)+"\n");
				escritor.append("Saldo apos o deposito: "+Conta.getVetorSaldo(i)+"\n");
				escritor.append("Data da realização do deposito: "+Conta.getVetorTempo(i)+"\n\n");
			}
		}
		escritor.close();
	}
}
