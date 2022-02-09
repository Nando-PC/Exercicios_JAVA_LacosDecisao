package Exercicios_aula;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float N, E = 0, ST = 0;
		int C;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o código do Operário: ");
		C = ler.nextInt();
		System.out.println("\nEntre com o número de horas trabalhadas: ");
		N = ler.nextFloat();
		if(N>50) {
			E = N - 50;
			ST = 50*10 + 20*E;
		}
		else {
			ST = N*10;
		}
		
		System.out.printf("\nO operário de código: %d, com horas: %.2f."
				+ " O salário total será de: R$ %.2f", C, N, ST);
					

	}

}
