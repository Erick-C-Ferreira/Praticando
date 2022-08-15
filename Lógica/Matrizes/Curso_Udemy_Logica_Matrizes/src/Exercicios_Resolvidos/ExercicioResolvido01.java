package Exercicios_Resolvidos;
/*
	Exercicio resolvido 01
	Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
	contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
	de valores negativos da matriz.
	
	Exemplo:
	Entrada				| Saida	
	3					| DIAGONAL PRINCIPAL:
	5 -3 10				| 5 8 -4
	15 8 2				| QUANTIDADE DE NEGATIVOS = 2
	7 9 -4				|
*/
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1- Definindo o tamanho da matriz quadrada
		int N = sc.nextInt();
		
		//2- Instanciando a matriz quadrada definida pelo valor N
		int[][] mat = new int[N][N];
		
		//3- Fazendo o preenchimento da matriz.
		for(int i=0; i<N; i++) {
			for(int j=0; j<N;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//4- Imprimindo os valores na diagonal da esquerda para direita..
		System.out.println("DIAGONAL PRINCIPAL");		
		for(int i=0; i<N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		//5- Percorrendo a matriz e contano quantos negativos possui.
		int cont = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N;j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		} System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
		
		sc.close();
	}

}
