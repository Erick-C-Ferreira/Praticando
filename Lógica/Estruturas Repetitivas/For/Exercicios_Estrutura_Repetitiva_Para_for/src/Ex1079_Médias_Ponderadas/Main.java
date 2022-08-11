package Ex1079_Médias_Ponderadas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
						
		for(int i = 0; i < n; i++) {
										
			double x = sc.nextDouble();	
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			x = x * 2.0;
			y = y * 3.0;
			z = z * 5.0;
			
			double media = (x + y + z) / 10.0;					
			
			System.out.printf("%.1f\n", media);
								
			}		
		
		sc.close();

	}

}
