package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1- Definindo as medidas da Matriz M linhas por N colunas
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		//2- Declarando e instanciando a Matriz MxN
		int[][] mat = new int[M][N];
		
		//3-Fazendo a leitura dos valores da Matriz
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//4- Imprimindo os valores negativos
		System.out.println("VALORES NEGATIVOS:");
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		sc.close();
		

	}

}
