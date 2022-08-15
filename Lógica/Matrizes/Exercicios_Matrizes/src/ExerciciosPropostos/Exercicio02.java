package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio02 {

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
		//4- Percorrendo a matriz e fazendo a soma dos valores
		for(int i=0; i<N; i++) {
			int soma = 0; //variavel auxiliar para efetuar a soma
			for(int j=0; j<N; j++) { 
				//Esta aqui pois vai percorrer a linha da matriz somando.
				soma = soma + mat[i][j];		
			}
			// imprimindo os valores somados de cada linha.
			System.out.println(soma);
		}		
				
		sc.close();
	}

}
