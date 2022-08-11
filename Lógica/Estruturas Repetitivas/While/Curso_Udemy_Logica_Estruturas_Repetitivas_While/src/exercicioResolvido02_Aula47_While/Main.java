package exercicioResolvido02_Aula47_While;

import java.util.Locale;
import java.util.Scanner;

/*
 Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a
idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor
de idade negativa. Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se for
entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".

Exemplos:
Entrada 				Sa�da
31						34.67
27
46
-5

Entrada 				Sa�da
-10 					impossivel calcular 

 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >=0) {
			soma = soma + idade; 	// Aqui se acumula a soma das idades
			cont = cont + 1;		// Aqui se conta a quantidade de idades de idades que que foi inserida que nao sao negativas 
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
			double media = (double) soma / cont; // aplicado casting para nao ter erro na divis�o
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("Impossivel calcular");
		}
		
		
		sc.close();
	}

}
