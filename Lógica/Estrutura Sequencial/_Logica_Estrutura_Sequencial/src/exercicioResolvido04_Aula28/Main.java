package exercicioResolvido04_Aula28;

import java.util.Scanner;

/*			URI 1019
 '	 		Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento 
 			em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

			Entrada
			O arquivo de entrada cont�m um valor inteiro N.

			Sa�da
			Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, 
			conforme exemplo fornecido.

					Exemplo de Entrada			Exemplo de Sa�da
							556						0:9:16
							 1						0:0:1
						  140153				   38:55:53
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, resto, horas, minutos, segundos;
		
		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":"+ minutos+ ":" + segundos);
		
		sc.close();

	}

}
