package Ex1146_Sequências_Crescentes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 0) { // comando de saida.
			
			for(int i = 1; i < x; i++) { // comando para escrever os numeros
				System.out.print(i + " "); // mostra na tela a sequencia crescente
			} 
				System.out.println(x); // imprime na tela o valor digitado por ultimo e pula linha
				
				x = sc.nextInt();
		}
		
		sc.close();		

	}

}
