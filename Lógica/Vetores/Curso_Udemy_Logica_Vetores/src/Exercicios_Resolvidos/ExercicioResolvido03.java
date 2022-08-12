package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

/*
 	Exercicio resolvido 03
	Fazer um programa para ler um número N, depois nome (apenas uma
	palavra sem espaços), idade e altura de N pessoas, conforme exemplo.
	Depois, mostrar na tela a altura média das pessoas, e mostrar também a
	porcentagem de pessoas com menos de 16 anos.

	Exemplo:
	Entrada				| Saida	
	5					| Altura média: 1.67
	Joao 15 1.82		| Pessoas com menos de 16 anos: 40%
	Maria 16 1.60		|
	Teresa 14 1.58		|
	Carlos 21 1.65		|
	Paulo 17 1.78		|
*/

public class ExercicioResolvido03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// iniciando com a quantidade de testes
		int N = sc.nextInt();
		
		// declarando e inicializando o vetor com a quantidade de testes N
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];
		
		// Fazendo a leitura para preenchimento dos Vetores nomes, idades, alturas
		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}
		
		// fazendo a soma das alturas.
		double soma = 0.0;
		for(int i=0; i < N; i++) {
			soma = soma + alturas[i];
		}
		// tirando a media da soma das alturas pela quantidade de idades N
		double media = soma / N;
		
		System.out.printf("Altura media: %.2f\n", media);
		
		// somando apenas a quantidade de pessoas com idade menor que 16
		int cont = 0;
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				cont++; //incremento que é mesma coisa que: cont = cont + 1;
			}
		}
		
		// fazendo regra de 3 para achar a % das idades.
		//  N 	= 100 %
		// cont = X% 
		// X = cont * 100 / N
		
		// aplicando casting mesmo com 100.0 que poderia ser apenas 100
		double x = (double) cont * 100.0 / N; 
				
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", x);
		
		
		
		sc.close();
		

	}

}
