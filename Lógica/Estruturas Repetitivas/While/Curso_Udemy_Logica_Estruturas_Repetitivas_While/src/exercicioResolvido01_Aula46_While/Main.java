package exercicioResolvido01_Aula46_While;

/*
 Exercicio Uri/Beecrowd 1113
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while ( X != Y) {
			if( X < Y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			X = sc.nextInt(); // Aqui nao precisa decalarar variavel com int
			Y = sc.nextInt(); // Basta apenas colocar a variavel para Ler.
		}
		
		sc.close();

	}

}
