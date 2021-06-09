package application;

public class testeDeCasting {
	public static void main(String[] args) {
		// Primeira parte da atividade 3
		
		int variavel1 = 1;
		int variavel2 = 2;
		
		System.out.println((variavel1 + variavel2));
		// Exemplo de casting
		double variavel3 = (int)variavel1;
		double variavel4 = (int)variavel2;
		
		System.out.println((variavel3 / variavel4));
		
		// Segunda parte da atividade 3
		
		char letra1 = 'A';
		char letra2 = 'Z';
		
		int variavel5 = (char)letra1 + (char)letra2;
		
		System.out.println((variavel5));
	}
}
