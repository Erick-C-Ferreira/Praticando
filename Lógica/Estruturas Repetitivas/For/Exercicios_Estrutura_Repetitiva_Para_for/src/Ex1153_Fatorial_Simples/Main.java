package Ex1153_Fatorial_Simples;

/*
 Exemplo de numeros fatoriais N!: n! = n . (n � 1). (n � 2). (n � 3)...2,1.
 
� 1! = 1 = 1
� 2! = 2 . 1 = 2
� 3! = 3 . 2 . 1 = 6
� 4! = 4. 3 . 2 . 1 = 24
� 5! = 5 . 4 . 3 . 2 . 1 = 120
� 6! = 6 . 5 . 4 . 3 . 2 . 1 = 720
� 7! = 7 . 6 . 5 . 4 . 3 . 2 . 1 = 5.040
� 8! = 8 . 7 . 6 . 5 . 4 . 3 . 2 . 1 = 40.320
� 9! = 9 . 8 . 7 . 6 . 5 . 4 . 3 . 2 . 1 = 362.880
� 10! = 10 . 9 . 8 . 7 . 6 . 5 . 4 . 3 . 2 . 1 = 3.628.800
� Aten��o! 0! = 1 e 1! = 1
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int fat = 1;
		for(int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
