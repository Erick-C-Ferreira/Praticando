package Ex1072_Intervalo_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // valor que define a quantidade de valores X
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) { // aqui le todos os valores de X
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) { // aqui verifica se esta dentro ou fora  
				in = in +1;			// do intervalo entre 10,20
			} else {
				out = out + 1;
			}
		}
			
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
