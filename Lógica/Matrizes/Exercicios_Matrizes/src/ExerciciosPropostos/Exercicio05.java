package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1- Definindo as medidas da Matriz M linhas por N colunas
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		//2- Declarando e instanciando a Matriz A
		int[][] A = new int[M][N];
		
		//2- Declarando e instanciando a Matriz B
		int[][] B = new int[M][N];
		
		//3- Declarando e instanciando a Matriz B
		int[][] C = new int[M][N];
		
		//4- Fazendo a leitura dos valores da Matriz A
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				A[i][j] = sc.nextInt();
			}
		}	
		
		//5- Fazendo a leitura dos valores da Matriz B
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		//6- Gerando a matriz C = A + B
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		//7- impressao da matriz C na tela
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}		

		sc.close();
	}

}
