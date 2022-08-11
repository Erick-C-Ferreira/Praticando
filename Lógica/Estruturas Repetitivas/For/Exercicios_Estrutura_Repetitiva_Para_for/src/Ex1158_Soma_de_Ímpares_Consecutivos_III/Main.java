package Ex1158_Soma_de_Ímpares_Consecutivos_III;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int soma = 0;
			int cont = 0;
			for(int j=x; cont<y; j++) { // comando pare efetuar soma consecutivas
				if (j % 2 != 0) { // separação dos numeros impares
					soma = soma + j; // soma dos numeros impares.
					cont = cont + 1;
				}
			}
			System.out.println(soma);			
		}		
		sc.close();
	}

}
