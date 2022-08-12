package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho do Vetor com base em N
		double[] vet = new double[N];
		
		double soma = 0;
		
		// fazendo a leitura e somando os valores do vetor
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		} 
		double media = soma / N; // tirando a media dos valores
		System.out.printf("%.3f\n", media); // imprimindo a media na tela
		
		// verificando os valores abaixo da media e imprimindo na tela
		for(int i=0; i<N; i++) {
			if(vet[i] < media) {
				System.out.printf("%.1f\n",vet[i]);
			}
		}
		
		sc.close();

	}

}
