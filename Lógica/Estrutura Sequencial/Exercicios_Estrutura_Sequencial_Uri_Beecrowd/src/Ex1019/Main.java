package Ex1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, horas, minutos, segundos, resto;
		
		N = sc.nextInt();
		
		horas = N / 3600; // 3600 segundos equivale a 1 hora, EM java o tempo é em segundos
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":"+ minutos + ":" + segundos);
		
		sc.close();

	}

}
