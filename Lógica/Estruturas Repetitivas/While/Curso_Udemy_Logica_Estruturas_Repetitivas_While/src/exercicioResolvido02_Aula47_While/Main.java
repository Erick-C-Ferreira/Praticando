package exercicioResolvido02_Aula47_While;

import java.util.Locale;
import java.util.Scanner;

/*
 Faça um programa para ler um número indeterminado de dados, contendo cada um, a
idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".

Exemplos:
Entrada 				Saída
31						34.67
27
46
-5

Entrada 				Saída
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
			double media = (double) soma / cont; // aplicado casting para nao ter erro na divisão
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("Impossivel calcular");
		}
		
		
		sc.close();
	}

}
