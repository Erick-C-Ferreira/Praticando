package Ex1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, media;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		media = X / Y;
		
		System.out.printf("%.3f km/l%n", media);
		
		sc.close();

	}

}
