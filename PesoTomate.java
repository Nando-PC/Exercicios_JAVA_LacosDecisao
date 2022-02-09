package Exercicios_aula;

import java.util.Scanner;

public class PesoTomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float P, E = 0, M = 0;
		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Insira o peso do tomate: ");
		 P = ler.nextFloat();
		 if (P>50) {
			 E = P - 50;
			 M = E * 4;				 
		 }
		 
		 System.out.printf("\nO peso do tomate é : %.2f , "
			 		+ "o valor excedente é: %.2f (kg) e a multa a ser paga é: R$ %.2f", P, E, M);
			 
		
	}

}
