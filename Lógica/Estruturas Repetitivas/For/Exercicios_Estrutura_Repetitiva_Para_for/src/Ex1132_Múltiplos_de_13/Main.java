package Ex1132_Múltiplos_de_13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int menor;
		int maior;
		
		if (x < y) {
			menor = x;
			maior = y;
		} else {
			menor = y;
			maior = x;
		}
		
		int soma = 0;
		for (int i = menor; i <= maior; i++) {
			if(i % 13 !=0) { // Verifica todos os numeros que não são divididos 
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
