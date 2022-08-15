package Problema_Exemplo;
/*
	Problema Exemplo
	Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
	matriz de M linhas e N colunas contendo números inteiros. Em seguida, mostrar na
	tela a matriz lida conforme exemplo.
 	
 	Entrada		| Saída
 	2 3			| 6 3 10
 	6 3 10		| 8 12 5
 	8 12 5		|
*/

import java.util.Scanner;

public class Exemplo01_Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int M = sc.nextInt(); // Linhas
		int N = sc.nextInt(); // Colunas
		
		// Criando e instanciando a Matriz com valores de M e N
		int[][] mat = new int[M][N];
		
		// Preenchimento da matriz
		for(int i = 0; i < M; i++) { //Percorre as linhas da Matriz M
			for(int j = 0; j < N; j++) { // Percorre as Colunas da Matriz J
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Imprimindo os valores inseridos na Matriz
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			} System.out.println(); // Apenas para dar uma quebra de linha
		}
		
		sc.close();		

	}

}
