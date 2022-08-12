package Problema_Exemplo;

import java.util.Scanner;

public class Exemplo02_Para_Cada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for(int i = 0; i < N; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("Nomes lidos:");
		/*for(int i = 0; i < N; i++) {
			System.out.println(nomes[i]);
		}*/
		
		// forma alternativa de percorrer uma coleção inteira
		// aplicando o para cada String de apelido S: do vetor nome.
		for(String s: nomes) { 
			System.out.println(s);
		}
		
		sc.close();
		
	}

}
