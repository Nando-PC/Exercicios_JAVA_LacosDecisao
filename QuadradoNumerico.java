package Exercicios_aula;

import java.util.Scanner;

public class QuadradoNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4;
		
		double q1, q2, q3, q4;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		n3 = ler.nextInt();
		System.out.println("Entre com o quarto n�mero: ");
		n4 = ler.nextInt();
		
		q1 = Math.pow(n1, 2);
		q2 = Math.pow(n2, 2);
		q3 = Math.pow(n3, 2);
		q4 = Math.pow(n4, 2);
		
		if(q3>=1000) {
			System.out.printf("O quadrado do terceiro n�mero %d �: %.1f", n3, q3);
		}
		else {
			System.out.printf("O quadrado dos n�meros: %d, %d, %d, %d "
					+ "s�o respectivamente: %.1f, %.1f, %.1f, %.1f", n1, n2, n3, n4, q1, q2, q3, q4);			
		}
		
		
		

	}

}
