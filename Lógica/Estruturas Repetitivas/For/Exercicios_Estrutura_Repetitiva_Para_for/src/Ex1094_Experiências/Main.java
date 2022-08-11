package Ex1094_Experiências;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int qtdC = 0;
		int qtdR = 0;
		int qtdS = 0;

		for (int i = 0; i < n; i++) {
			
			int num = sc.nextInt();
			char x = sc.next().charAt(0); // serve para leitura de um caracter

			if (x == 'C') {
				qtdC = qtdC + num;
			} else if (x == 'R') {
				qtdR = qtdR + num;
			} else {
				qtdS = qtdS + num;
			}
		}

		int total = qtdC + qtdR + qtdS;
		double perC = (double) qtdC / total * 100.0;
		double perR = (double) qtdR / total * 100.0;
		double perS = (double) qtdS / total * 100.0;

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + qtdC);
		System.out.println("Total de ratos: " + qtdR);
		System.out.println("Total de sapos: " + qtdS);
		System.out.printf("Percentual de coelhos: %.2f %%\n", perC);
		System.out.printf("Percentual de ratos: %.2f %%\n", perR);
		System.out.printf("Percentual de sapos: %.2f %%\n", perS);

		sc.close();

	}

}
