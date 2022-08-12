package Teste_de_Mesa;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int[] V = new int[7];
		
		int a = 7;
		int b = a - 6;
		while(b < a) {
			V[b] = b * a;
			b = b + 2;
		}
	}
}
