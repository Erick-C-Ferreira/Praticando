package Ex1118_VáriasNotasComValidação;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 1;		
		while (x == 1) {
			double nota1 = sc.nextDouble();
			while(nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}
			
			double nota2 = sc.nextDouble();
			while(nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}
			
			double media = (nota1 + nota2) / 2.0;
			System.out.printf("media = %.2f\n", media);
			
			System.out.println("novo calculo (1-sim 2-nao)");
			x = sc.nextInt();
			while (x != 1 && x != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				x = sc.nextInt();
			}
		}		
								
		sc.close();
	}
}
