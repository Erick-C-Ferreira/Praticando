package Problema_Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01_Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N]; //declarando e instanciando o vetor
		
		for(int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble(); // para ler e guardar os valores até concluir.
		}
		
		for (int i=0; i <N; i ++) { // for para imprirmir na tela os valores guardados do vetor.
			System.out.printf("%.1f\n", vet[i]);
		}
		sc.close();

	}

}
