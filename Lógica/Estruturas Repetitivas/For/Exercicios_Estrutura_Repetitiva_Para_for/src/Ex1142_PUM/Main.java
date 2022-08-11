package Ex1142_PUM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int start = 1; // inicio
		
		for(int i = 1; i <= n; i++) {
			int second = start+1; // segundo
			int third = start+2; // terceiro
			
			System.out.printf("%d %d %d PUM\n", start, second, third);
			
			start = start+4;
		}
		
		sc.close();

	}

}
