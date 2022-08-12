package Teste_de_Mesa;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int[] V = new int[7];
		int[] W = new int[7];
		
		int a = 2;
		//int b = 5; // tirar o // para ativar a variavel.
		
		for(int c = 0; c < 3; c++) {
			V[c] = a;
			W[c] = c * V[c];
		}
	}
}
