package Teste_de_Mesa;

public class Exercicio05 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int M = 5;		
		
		int[][] mat = new int[M][M];
		int[] V = new int[M];
		
		for(int i=0; i<M; i++) {
			V[i] = 10 - i;
		}
		
		for(int i=0; i<M; i++) {
			mat[i][i] = V[i] / 10;
		}

	}

}
