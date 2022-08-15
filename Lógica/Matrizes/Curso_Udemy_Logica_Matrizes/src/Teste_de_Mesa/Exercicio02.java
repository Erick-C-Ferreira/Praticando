package Teste_de_Mesa;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int M = 2;
		int N = 4;
		int X = 0;
		
		int[][] mat = new int[M][N];
		
		for(int i=0; i<M; i++) {
			X = X + i;
			for(int j=0; j<N; j++) {
				X = X + j;
				mat[i][j] = X;
			}
		}

	}

}
