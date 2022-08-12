package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho dos Vetores com base em N
		double[] alturas = new double[N];
		char[] sexos = new char[N];
		
		// Fazendo a leitura das alturas e sexos para preencher os Vetores
		for(int i=0; i<N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}
		
		// 1- Localizando a Menor Altura Inserida
		double menorAltura = alturas[0];
		for(int i=0; i<N; i++) {
			if(alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		} System.out.printf("Menor altura = %.2f\n", menorAltura);
		
		// 2-  Localizando a Maior Altura Inserida
		double maiorAltura = alturas[0];
		for(int i=0; i<N; i++) {
			if (alturas [i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		} System.out.printf("Maior altura = %.2f\n", maiorAltura);
		
		// 3- somando as alturas das Mulheres e tirando a media Aritimetica
		double somaDasAlturasDasMulheres = 0.0;
		int contMulheres = 0;
		for(int i=0; i<N; i++) {
			if(sexos[i] == 'F') {
				somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + alturas[i];
				contMulheres++; // somando a quantidade de mulheres.
			}
			// verificando se tem mulheres dentre as pessoas inseridas.
		} if (contMulheres == 0) {
			System.out.println("Nao ha nenhuma mulher dentre as pessoas");
		} else {
			// calculando a media aritimetica.
			double media = somaDasAlturasDasMulheres / contMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f\n", media);
		} 
		
		// 4- Numero de Homens
		int contHomens = 0;
		for(int i=0; i<N; i++) {
			if (sexos[i] == 'M') {
				contHomens++;
			}
		} System.out.println("Numero de homens = " + contHomens);
		
		sc.close();

	}

}
