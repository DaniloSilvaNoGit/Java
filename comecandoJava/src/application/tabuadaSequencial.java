package application;
import java.util.Scanner;

public class tabuadaSequencial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero da tabuada");
		int numeroEscolhido = scan.nextInt();
		System.out.println("Digite o caracter de sua preferencia: ");
		char linha = scan.next().charAt(0);
		System.out.println("Digite a quantidade de caracteres: ");
		int quantidade = scan.nextInt();
		
		criaLinha(linha,quantidade);
		System.out.println("Numeros entre 1 e 5\n");
		criaLinha(linha,quantidade);
		
		for(int index = 1; index <= 10; index++) {
			multiplicacao(index,10);
			System.out.print(index);
			System.out.print(" X ");
			System.out.print(numeroEscolhido);
			System.out.print(" = ");
			System.out.print(index*numeroEscolhido);
			System.out.println();
		}
		scan.close();
	}
	public static void criaLinha(char linha1, int repeticao) {
		for(int index = 0; index < repeticao; index++) {
			System.out.print(linha1);
		}
		System.out.println();
	}
	public static int multiplicacao(int num1, int num2) {
		int calculo = num1 * num2;
		return calculo;
	}
}
