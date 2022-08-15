package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1- Definindo as medidas da Matriz M filas por N soldados
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
		
		int fila = sc.nextInt(); // variavel para saber qual fila M alterar.
		
		// como a matriz comeca na linha 0, decrementar o valor da fila
		fila = fila - 1;
		
		// agora passo 1: salvar o ultimo da fila escolhida
		int ultimoDaFila = mat[fila][N-1];
		
		// passo 2: precisa de mover todos da fila (menos o ultimo) para a direita,
		// mas tem que fazer isso da direita para a esquerda (contagem decrescente)
		for (int j=N-1; j>0; j--) {
			mat[fila][j] = mat[fila][j-1];
		}
		
		// passo 3: agora armazenar o ultimo na primeira posicao da fila
		mat[fila][0] = ultimoDaFila;
		
		// pronto! Agora imprimir a matriz alterada:
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
