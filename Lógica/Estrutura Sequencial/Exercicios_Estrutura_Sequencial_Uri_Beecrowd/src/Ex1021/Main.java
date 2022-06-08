package Ex1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorInf;
		int valor = 0; // variavel auxliar para fazer o Casting.
		
		valorInf = sc.nextDouble();

		System.out.println("NOTAS:");
		
		valor = (int) valorInf /100;
		System.out.printf("%d nota(s) de R$ 100.00\n", valor);
		valorInf = valorInf % 100.0;
		
		valor = (int) valorInf /50;
		System.out.printf("%d nota(s) de R$ 50.00\n", valor);
		valorInf = valorInf % 50.0;
		
		valor = (int) valorInf /20;
		System.out.printf("%d nota(s) de R$ 20.00\n", valor);
		valorInf = valorInf % 20.0;
		
		valor = (int) valorInf /10;
		System.out.printf("%d nota(s) de R$ 10.00\n", valor);
		valorInf = valorInf % 10.0;
		
		valor = (int) valorInf /5;
		System.out.printf("%d nota(s) de R$ 5.00\n", valor);
		valorInf = valorInf % 5.0;
		
		valor = (int) valorInf /2;	
		System.out.printf("%d nota(s) de R$ 2.00\n", valor);
		valorInf = valorInf % 2.0;
		
		valorInf = valorInf * 100.0;	// foi multiplicado porque assim se trabalha moeda como se fosse notas.
				
		System.out.println("MOEDAS:");
		
		valor = (int) valorInf /100;
		System.out.printf("%d moeda(s) de R$ 1.00\n", valor);
		valorInf = valorInf % 100.0;
		
		valor = (int) valorInf /50;
		System.out.printf("%d moeda(s) de R$ 0.50\n", valor);
		valorInf = valorInf % 50.0;
		
		valor = (int) valorInf /25;
		System.out.printf("%d moeda(s) de R$ 0.25\n", valor);
		valorInf = valorInf % 25.0;
		
		valor = (int) valorInf /10;
		System.out.printf("%d moeda(s) de R$ 0.10\n", valor);
		valorInf = valorInf % 10.0;
		
		valor = (int) valorInf /5;		
		System.out.printf("%d moeda(s) de R$ 0.05\n", valor);
		valorInf = valorInf % 5.0;
		
		valor = (int) valorInf /1;
		System.out.printf("%d moeda(s) de R$ 0.01\n", valor);
		valorInf = valorInf % 1.0;

		sc.close();

	}

}
