package Ex1061;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// W = Dia, X = Hora, Y = Minuto, Z = Segundos
		int w1, x1, y1, z1,  W, X, Y, Z, inicio, fim, duracao, resto;
		int w2, x2, y2, z2;
		String s;
	
		s = sc.next();
		w1 = sc.nextInt();
		x1 = sc.nextInt();
		s = sc.next();
		y1 = sc.nextInt();
		s = sc.next();
		z1 = sc.nextInt();
		
		s = sc.next();
		w2 = sc.nextInt();
		x2 = sc.nextInt();
		s = sc.next();
		y2 = sc.nextInt();
		s = sc.next();
		z2 = sc.nextInt();
		sc.close();
		
		// W1=Dia * 24 horas * 60 minutos * 60 segundos + X1=horaIformada * 60 minutos * 60 segundos + Y1minutoInformado * 60 segundos + Z1= segundos
		inicio = w1*24*60*60 + x1*60*60 + y1*60 +z1; 
		// A mesma logica do inicio vale aqui
		fim = w2*24*60*60 + x2*60*60 + y2*60 + z2;
		duracao = fim - inicio;
		
		W = duracao / (24*60*60); // resultado duracao / (24 horas * 60 minutos * 60 segundos)
		resto = duracao % (24*60*60);
		X = resto / (60*60); // resto da divisao da hora / (60 minutos * 60 segundos)
		resto = resto % (60*60);
		Y = resto / 60;
		Z = resto % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");
		
		sc.close();

	}

}
