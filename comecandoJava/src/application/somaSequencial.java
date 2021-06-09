package application;
import java.util.Scanner;

public class somaSequencial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		
		int soma = 0;
		for(int index = valor; index >= 0; index--) {
			soma = soma + index;
		}
		System.out.println();
		System.out.println(soma);
		scan.close();
	}
}
