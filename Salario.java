package Exercicios_aula;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float N, E = 0, ST = 0;
		int C;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o c�digo do Oper�rio: ");
		C = ler.nextInt();
		System.out.println("\nEntre com o n�mero de horas trabalhadas: ");
		N = ler.nextFloat();
		if(N>50) {
			E = N - 50;
			ST = 50*10 + 20*E;
		}
		else {
			ST = N*10;
		}
		
		System.out.printf("\nO oper�rio de c�digo: %d, com horas: %.2f."
				+ " O sal�rio total ser� de: R$ %.2f", C, N, ST);
					

	}

}
