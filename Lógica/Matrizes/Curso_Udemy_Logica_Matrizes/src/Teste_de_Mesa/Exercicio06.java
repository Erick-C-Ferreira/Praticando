package Teste_de_Mesa;

public class Exercicio06 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int N = 3;		
		int[][] mat = new int[N][N];
		
		for(int i = 0; i<N; i++) {
			for(int j=0; j<i; j++) {
				mat[i][j] = (i + 1) * 10;
			}
		}

	}

}
