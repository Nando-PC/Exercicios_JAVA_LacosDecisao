package Exercicios_aula;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base, altura, area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor da base do tri�ngulo: ");
		base = ler.nextFloat();
		System.out.println("\nEntre com o valor da altura do tri�ngulo: ");
		altura = ler.nextFloat();
		
		if(base>0 && altura>0) {
			area = (base*altura)/2;
			System.out.println("\n A �rea do tri�ngulo �: "+area);
		}
		else {
			System.out.println("\n Os valores devem ser positivos e maiores que zero!!");
		}

	}

}
