package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio03 {

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
		
		//4- Localizando o Maior valor de cada Linha da Matriz.
		for(int i=0; i<N; i++) {
			
			int maior = mat[i][0]; // i para alterar a linha toda vez que i++
			
			for(int j=0; j<N; j++) {
				if(mat[i][j] > maior) {
				maior = mat[i][j];
				}
			} 
			// Imprimindo o maior numero de cada Linha.
			System.out.println(maior);
		}
				
				
		sc.close();

	}

}
