package Ex1101_Sequência_de_Números_e_Soma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		while(m > 0 && n > 0) { // verifica se os valores sao maior que zero
		
			int menor = m;
			int maior = n;
			
		//  Ordenando do menor para o maior
			if (m > n) { 
				menor = n;
				maior = m;
			} else {
				menor = m;
				maior = n;
			}
			
			// fazendo a soma da sequencia e imprimindo na tela
			int soma = 0; 
			for(int i = menor; i <= maior; i++) {
				soma = soma + i;
				System.out.print(i + " ");
			} 
			System.out.println("Sum=" + soma);
			
			m = sc.nextInt();
			n = sc.nextInt();
			
		} 		
		
		sc.close();
	}

}
