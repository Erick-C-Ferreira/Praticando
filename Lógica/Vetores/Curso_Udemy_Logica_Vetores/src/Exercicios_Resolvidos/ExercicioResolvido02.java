package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

/*
 	Exercicio resolvido 02
	Faça um programa que leia N números reais e armazene-os em um vetor.
	Em seguida:
	- Imprimir todos os elementos do vetor
	- Mostrar na tela a soma e a média dos elementos do vetor
	
	Exemplo:
	Entrada				| Saida	
	4					| 8.0 4.0 10.0 14.0
	8.0 4.0 10.0 14.0	| 36.00
						| 9.00
 */
public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // aqui indica o tamanho no vetor
		double[] vet = new double[N];
		
		for(int i = 0; i < N; i++) { // Faz leitura e prenche o vetor com
			vet[i] = sc.nextDouble(); // a quantidade de valores definidos em N
		}
		
		for (int i = 0; i < N; i++) { // Imprime na tela os valores lidos
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		
		double soma = 0.0;
		for (int i = 0; i < N; i++) { //Faz a soma de todos os valores lidos
			soma = soma + vet[i];
		}
		System.out.printf("%.2f\n", soma);;
						
		double media = soma / N; // tira a media da soma dos valores lidos.
		System.out.printf("%.2f\n", media);
		sc.close();

	}

}
