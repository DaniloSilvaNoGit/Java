package application;
import java.util.Scanner;

public class verificaTriangulosEspecial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de um dos angulos de um Triangulo: ");
		int angulo1 = scan.nextInt();
		System.out.println("Digite o segundo angulo: ");
		int angulo2 = scan.nextInt();
		System.out.println("Digite o terceiro angulo: ");
		int angulo3 = scan.nextInt();
		
		while(angulo1 == 0 || angulo2 == 0 || angulo3 == 0) {
			System.out.println("Algum dos angulos digitados é 0. Por faovr digite novamente os valores");
			System.out.println("Digite o valor de um dos angulos de um Triangulo: ");
			angulo1 = scan.nextInt();
			System.out.println("Digite o segundo angulo: ");
			angulo2 = scan.nextInt();
			System.out.println("Digite o terceiro angulo: ");
			angulo3 = scan.nextInt();
		}
		
		if(angulo1 + angulo2 + angulo3 == 180) {
			System.out.println("Isto é realmente um triangulo");
		}
		else {
			System.out.println("Isto não é um triangulo");
		}
		scan.close();
	}
}