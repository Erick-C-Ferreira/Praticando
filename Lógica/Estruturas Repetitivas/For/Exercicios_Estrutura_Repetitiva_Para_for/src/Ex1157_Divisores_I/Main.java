package Ex1157_Divisores_I;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) { // aqui verifica todos os possiveis divisores de N 
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
