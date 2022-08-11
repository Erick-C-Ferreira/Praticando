package Ex1080_Maior_e_Posição;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int maior = 0;	// O primeiro valor 0(Zero) sendo inicialmente o maior
		int posicao = 1; // e na primeira posição
		
		
		for(int i = 1; i <= 100; i++) { //
			int x = sc.nextInt(); // aqui se le os 100 numeros 
			if(x > maior) {
				maior = x; // Indica o maior valor
				posicao = i; // Aqui indica a posição do valor inserido
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
			
		sc.close();
		

	}

}
