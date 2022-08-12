package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Indicando quantos numeros vai ser analisados
		int N = sc.nextInt();
		// Definindo o tamanho do vetor com base na quantidade N
		int[] vet = new int[N];
		
		int cont = 0; //comentar essa linha para acessar Alternativa
		
		//verificando quais são os numeros Pares e somando eles.
		for(int i=0; i<N;i++) {
			vet[i] = sc.nextInt();
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont = cont +1; // comentar essa linha para acessar Alternativa
			}			
		} System.out.println();
 		System.out.println(cont); //comentar essa linha para acessar Alternativa
		 
 		//Alternativa:
 		  /*int quantidadeDePares = 0;
 		  for(int i=0; i<N; i++) {
 		  	 if(vet[i] % 2 == 0) {
 		  	 	quantidadeDePares++;
 		  	 }
 		  } 
 		  System.out.println(quantidadeDePares);
 		 */
		
		sc.close();

	}

}
