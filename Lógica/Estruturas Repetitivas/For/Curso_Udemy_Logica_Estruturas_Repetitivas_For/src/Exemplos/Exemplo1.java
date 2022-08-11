package Exemplos;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
			
		int soma = 0;
		for(int i = 0; i < N; i++) { // for(inicio=apeans uma vez; Condição = funciona igual o while ; incremento = executa toda vez apos voltar)
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma); 
				
		sc.close();

	}

}
