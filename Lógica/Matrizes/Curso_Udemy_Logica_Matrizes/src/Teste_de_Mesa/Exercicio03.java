package Teste_de_Mesa;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Fazer o DeBug para Comprender Melhor o Funcionamento
		
		int M = 2;		
		
		int[][] mat = new int[M][M];
		
		for(int i=0; i<M; i++) {
			mat[3][i] = 10;
		}
		
		for(int i=0; i<M; i++) {
			mat[i][4] = 10 * i;
			mat[i][i] = 50;
		}
	}

}
