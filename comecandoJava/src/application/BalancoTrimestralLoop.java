package application;
import java.util.Scanner;

// Atividade precisa de melhora 

public class BalancoTrimestralLoop {
	public static void main(String[] args) {
		// Declaração do objeto de leitura (inp)
		Scanner inp = new Scanner(System.in);
		
		for(int index = 0; index < 4; index++) {
			System.out.println("Trimestre numero "+ (index + 1));
			System.out.println("Digite os gastos do  mês: ");
			int gastosPrimeiroMes = inp.nextInt();
			System.out.println("Digite os gastos do segundo mês: ");
			int gastosSegundoMes = inp.nextInt();
			System.out.println("Digite os gastos do terceiro mês: ");
			int gastosTerceiroMes = inp.nextInt();
			
			int gastosTotais = gastosPrimeiroMes + gastosSegundoMes + gastosTerceiroMes;
			System.out.println("O gasto total do trimestre é: R$ " + gastosTotais);
			System.out.println("");
		}
		
		inp.close();
	}
}
