package Teste_de_Mesa;

public class Exercicio04 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int N = 3;		
		int[][] mat = new int[N][N];
		int[] V = new int[N];
		
		for(int i = 0; i<N; i++) {
			int X = 0;
			for(int j=0; j<N; j++) {
				mat[i][j] = i + j;
				X = X + mat[i][j];
			}
			V[i] = X;
		}

	}

}
