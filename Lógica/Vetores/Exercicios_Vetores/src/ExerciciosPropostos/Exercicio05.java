package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho do Vetor com base em N
		int[] vet = new int[N];
		
		// Variaveis Auxiliar
		double soma = 0;
		int cont = 0;
		
		// 1- Fazendo a leitura dos valores para preencher o Vetor
		// 2- Somando o valor dos numeros pares.
		// 3- Somando a quantidade de numeros pares inseridos.
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				cont++;
			} 
		} 
		
		if(cont == 0) {
				System.out.println("Não havia nenhum numero par");
			} else {
		// tirando a media aritimetica dos numeros pares.
		} double media = soma / cont;
		System.out.printf("%.1f\n", media);
		
		sc.close();
	}

}
