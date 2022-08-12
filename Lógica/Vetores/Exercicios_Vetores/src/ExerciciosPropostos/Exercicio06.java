package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho dos Vetores com base em N
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
		// Fazendo a leitura dos nomes e idades para preencher os Vetores
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();				
		} 
		
		// Variaveis Auxiliar
		int maiorIdade = 0;
		int posicaoMaiorIdade = 0;
		
		// 1- Encontrando a posição da maior idade
		for(int i=1; i<N; i++) {
			if(idades[i] > maiorIdade) {
			maiorIdade = idades[i];
			posicaoMaiorIdade = i;
			}
		}
		
		// 2- agora acessando o vetor de nomes na posicao da maior idade
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
		sc.close();

	}

}
