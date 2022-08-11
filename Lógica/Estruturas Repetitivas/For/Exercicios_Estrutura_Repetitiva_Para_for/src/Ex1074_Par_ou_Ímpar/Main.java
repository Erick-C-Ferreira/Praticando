package Ex1074_Par_ou_Ímpar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();			
			
			if(x % 2 == 0 && x > 0) { // Aqui verifica se X é (Par e Positivo)
				System.out.println("EVEN POSITIVE");
			} else if(x % 2 == 0 && x < 0) { // Aqui verifica se X é (Par e Negativo)
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 != 0 && x > 0) { // Aqui verifica se X é (Impar e Positivo)
				System.out.println("ODD POSITIVE"); 
			} else if(x % 2 != 0 && x < 0) { // Aqui verifica se X é (Impar e Negativo)
				System.out.println("ODD NEGATIVE");
			} else { // Mesma coisa que if(x == 0) ou seja se o valor for 0 = Nulo
				System.out.println("NULL");
			}
		}
		sc.close();
	}

}
