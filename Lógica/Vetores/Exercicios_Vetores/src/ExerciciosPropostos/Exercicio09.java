package ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo quantidade de testes
		int N = sc.nextInt();
		
		// Definindo tamanho dos Vetores com base em N
		String[] nomes = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];
		
		// Fazendo a leitura do nome, valor de compra e venda para preencher os Vetores
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}
		
		//1- Encontrando a quantidade para cada faixa de lucro desejada
		
		// Variaveis Auxiliar
		int contAbaixoDe10 = 0;
		int contEntre10E20 = 0;
		int contAcimaDe20 = 0;
		
		for(int i=0; i<N; i++) {
			
			//calculando o lucro sobre a venda do produto
			double lucro = venda[i] - compra[i];
			
			// calculado a porcentagem de Lucro sobre os produtos
			double porcentagemDeLucro = lucro / compra[i] * 100.0;
			
			// fazendo leitura de dados referente as variavies Auxiliar.
			// lucro até 10% = <10%
			// lucro entre 10% e 20% = 10% <= lucro <= 20%
			// lucro maior que 20% = lucro > 20%
			if(porcentagemDeLucro < 10.0) {
				contAbaixoDe10++;
			} else if(porcentagemDeLucro <= 20.0) {
				contEntre10E20++;
			} else {
				contAcimaDe20++;
			}
		}
		System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
		System.out.println("Lucro acima de 20%: " + contAcimaDe20);
		
		// 2- Achando os totais
		
		// Variaveis Auxiliar para Totais.
		double totalCompra = 0.0;
		double totalVenda = 0.0;
		
		// Localizando os valores totais de compra e venda.
		for(int i=0; i<N; i++) {
			totalCompra = totalCompra + compra[i];
			totalVenda = totalVenda + venda[i];
		} 
		
		// Localicando o valor de Lucro total.
		double totalLucro = totalVenda - totalCompra;
	
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
		
		sc.close();

	}

}
