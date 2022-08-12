package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho dos Vetores A e B com base em N
		int[] A = new int[N];
		int[] B = new int[N];
		
		// Fazendo a leitura dos valores referente a A
		for(int i=0; i<N;i++) {
			A[i] = sc.nextInt();
		}
		// Fazendo a leitura dos valores referente a B
		for(int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		
		// Instanciando o Vetor C
		int[] C = new int[N];
		
		// Fazendo a coma de A + B para gerar o Vetor C
		for(int i = 0; i<N; i++) {
			C[i] = A[i]+B[i];
			System.out.print(C[i] + " ");
		}				
		sc.close();	
	}
}
