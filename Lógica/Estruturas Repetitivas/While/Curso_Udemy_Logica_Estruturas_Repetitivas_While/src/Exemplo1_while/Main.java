package Exemplo1_while;

/*
 * Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();		
		int soma = 0;
		
		while (X != 0) {
			soma = soma + X; // ou Usar: soma += X;
			X = sc.nextInt();					
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
