package Ex1159_SomaDeParesConsecutivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma;
		
		while (x != 0) { 
			if(x % 2 != 0) { // se for impar, somar + 1
				x = x +1;
			}
			soma = x + x + 2 + x + 4 + x + 6 + x +8;
			System.out.println(soma);
			
			x = sc.nextInt();
		}		
		
		sc.close();

	}

}
