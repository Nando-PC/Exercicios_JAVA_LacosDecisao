package Exercicios_aula;

import java.util.Scanner;

public class QuadradoNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4;
		
		double q1, q2, q3, q4;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3 = ler.nextInt();
		System.out.println("Entre com o quarto número: ");
		n4 = ler.nextInt();
		
		q1 = Math.pow(n1, 2);
		q2 = Math.pow(n2, 2);
		q3 = Math.pow(n3, 2);
		q4 = Math.pow(n4, 2);
		
		if(q3>=1000) {
			System.out.printf("O quadrado do terceiro número %d é: %.1f", n3, q3);
		}
		else {
			System.out.printf("O quadrado dos números: %d, %d, %d, %d "
					+ "são respectivamente: %.1f, %.1f, %.1f, %.1f", n1, n2, n3, n4, q1, q2, q3, q4);			
		}
		
		
		

	}

}
