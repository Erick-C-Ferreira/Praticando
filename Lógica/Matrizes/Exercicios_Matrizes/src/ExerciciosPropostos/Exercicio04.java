package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1- Definindo as medidas da Matriz Quadrada NxN
		int N = sc.nextInt();
		
		//2- Declarando e instanciando a Matriz NxN
		int[][] mat = new int[N][N];
		
		//3-Fazendo a leitura dos valores da Matriz
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		//4- Somando elementos acima da diagonal principal.
		int soma = 0; // Variavel auxiliar para efetuar a soma.
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) { // j inicia com i + 1
				soma = soma + mat[i][i];
			}			
		}
		System.out.println(soma);
		
		sc.close();
	}

}
