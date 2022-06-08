package Ex1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, anos, meses, dias, resto;
		
		N = sc.nextInt();
		
		anos = N / 365; 	// N / 365 para achar quantos anos tem
		resto = N % 365; 	
		meses = resto / 30;	// Aqui é o resto da divisão de N / 365 que vai dividir por 30 para achar os meses 
		dias = resto % 30; // Aqui é o oque sobrou da divisao de resto/ 30 para saber os meses que serao considerado dias
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}

}
