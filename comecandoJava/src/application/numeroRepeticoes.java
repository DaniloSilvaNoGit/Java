package application;
import java.util.Scanner;


public class numeroRepeticoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite um numero de repetições: ");
		int insersao = scan.nextInt();
		
		for(int index = 0; index <= insersao; index++) {
			System.out.println(index);
			System.out.println();
		}
		scan.close();
	}
}
