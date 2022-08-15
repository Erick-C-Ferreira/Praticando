package Exercicios_Resolvidos;

/*
	Exercicio resolvido 02
	Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
	de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
	elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
	Mostrar o vetor gerado.
	
	Exemplo:
	Entrada				| Saida	
	2 3					| 25.0
	7.0 8.0 10.0		| 10.0
	2.0 3.0 5.0			| 
						|
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//1- Definir linhas M e colunas N da matriz
		int M = sc.nextInt(); // definindo numero de linhas M
		int N = sc.nextInt(); // definindo numero de colunas N
		double[][] numeros = new double[M][N];
		
		//2- Fazer preenchimento da matriz
		for(int i=0; i<M; i++) { // linhas M
			for(int j=0; j<N; j++) { // colunas N
				numeros[i][j] = sc.nextDouble();				
			}
		}		
		
		//3- Criando um Vetor para fazer a soma dos elementos da linha da matriz
		double[] vet = new double[M];
		
		//4-Percorrendo a matriz e fazendo a soma dos valores
		for(int i=0; i<M; i++) { // linhas M
			double soma = 0.0; //variavel auxiliar para efetuar a soma
			for(int j=0; j<N; j++) { 
				// esta declarado aqui pois vai percorrer a linha da matriz somando.
				soma = soma + numeros[i][j];		
			}
			vet[i] = soma;
		}		
		
		//4- Imrpimindo o Vetor
		for(int i=0; i<M; i++) {
			System.out.printf("%.1f\n", vet[i]);
		}
		
		sc.close();

	}

}
