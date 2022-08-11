package atribuicaoCumulativa_Aula38;

import java.util.Scanner;

/*
 		Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
	dá direito a 100 minutos de telefone. Cada minuto que exceder a
	franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
	quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
	a ser pago.
			Entrada 				Saída
			  22 				Valor a pagar: R$ 50.00
			Entrada 				Saída
			  103 				Valor a pagar: R$ 56.00
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2; //conta = conta + (minutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		
		sc.close();
	}
}
