package Teste_de_Mesa;

public class Exercicio06 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int[] V = new int[7];
		
		V[0] = 2;
		
		for (int d=1; d<4; d++) {
			V[d] = V[d-1] * 2;
			System.out.println(V[d]);
		}
		
		int[] W = new int[7];
		
		for(int d=0; d<4;d++) {
			W[d] = V[d]*10;
			System.out.println(W[d]);
		}		
	}
}
