package Exercicios_aula;

import java.util.Scanner;

public class VerificarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro: ");
		N = ler.nextInt();
		
		if(N>=0) {
			if(N%2==0) {
				System.out.println("\nEste n�mero � positivo e par!");
			}
			else {
				System.out.println("\nEste n�mero � positivo e �mpar!");
			}
		}
		else {
			if(N%2==0) {
				System.out.println("\nEste n�mero � negativo e par!");
			}
			else {
				System.out.println("\nEste n�mero � negativo e �mpar!");
			}
		}
		
	}

}
