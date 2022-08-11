package Ex1134_TipoDeCombustivel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(tipo != 4) {
			switch (tipo) {		// tambem é possivel fazer com if(tipo == 1)
		case 1:					
			alcool = alcool+1;
			break;
		case 2:
			gasolina = gasolina+1; // else if(tipo == 2)
			break;
		case 3:
			diesel = diesel+1;		// else if(tipo == 4)
			break;
		}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
