package Ex1067_Números_Ímpares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if(i % 2 != 0) { // Aqui esta verificando se o numero é impar.
				System.out.println(i);	
			}
		}		
		
		sc.close();		
	}

}
