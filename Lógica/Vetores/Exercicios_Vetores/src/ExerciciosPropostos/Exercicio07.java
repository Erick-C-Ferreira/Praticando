package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho dos Vetores com base em N
		String[] nomes = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		
		// Fazendo a leitura dos nomes e notas 1 e 2 para preencher os Vetores
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		} 
		System.out.println("Alunos aprovados");
		
		// Encontrando a media das notas para saber quem esta aprovado.
		for(int i=0; i<N; i++) {
			double media = (nota1[i] + nota2[i]) / 2.0;
			if (media >= 6.0) {
				// Exibindo na tela quem foi Aprovado.
				System.out.println(nomes[i]);
			}
		}		
		sc.close();

	}

}
