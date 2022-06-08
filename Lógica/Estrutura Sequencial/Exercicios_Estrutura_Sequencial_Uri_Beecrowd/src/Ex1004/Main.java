package Ex1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, prod;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		prod = x*y;
		
		System.out.println("PROD = " + prod);
		
		sc.close();

	}

}
