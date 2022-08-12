package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// indicando quantidade de valores a receber
		int N = sc.nextInt(); 
		// Definindo tamanho do vetor pela quantidade de valor a receber N
		double[] vet = new double[N];
		
		// variavel auxliar
		double maior = 0;
		int position = 1;
		
		// localizando o maior valor inserido e mostrando a posição que foi colocado
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
			if(vet[i] > maior) {
				maior = vet[i];
				position = i;
			}
		}		
		
		System.out.printf("%.1f\n",maior);
		System.out.println(position);
		
		sc.close();

	}

}
