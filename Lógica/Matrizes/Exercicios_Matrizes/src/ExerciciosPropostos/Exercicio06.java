package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//1- Definindo as medidas da Matriz Quadrada NxN
		int N = sc.nextInt();
		
		//2- Declarando e instanciando a Matriz NxN
		double[][] mat = new double[N][N];
		
		//3-Fazendo a leitura dos valores da Matriz
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		//4- Fazendo a leitura dos indices de Linha e Coluna.
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		//5- a)Efetuando a Soma dos numeros positivos da Matriz
		
		double soma = 0.0; //variavel auxiliar
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] > 0.0) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.2f\n", soma);
		
		//6- b) Imprimindo os elementos da Linha Escolhida
		System.out.printf("LINHA ESCOLHIDA: ");
		for(int j=0; j<N; j++) {
			System.out.printf("%.1f ", mat[linha][j]);
		} System.out.println();
		
		//7- c) Imprimindo os elementos da Coluna Escolhida
		System.out.println("COLUNA ESCOLHIDA: ");
		for(int i=0; i<N; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		} System.out.println();
		
		//8- d) Imprimindo a Diagonal Principal
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i=0; i<N; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		} System.out.println();
		
		//9- e) Alterando a matriz elevando os negativos ao quadrado
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] < 0.0) {
					Math.pow(mat[i][j], 2);
					//Ou mat[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA:");
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
		}		
		sc.close();
	}

}
