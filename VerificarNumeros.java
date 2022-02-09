package Exercicios_aula;

import java.util.Scanner;

public class VerificarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		N = ler.nextInt();
		
		if(N>=0) {
			if(N%2==0) {
				System.out.println("\nEste número é positivo e par!");
			}
			else {
				System.out.println("\nEste número é positivo e ímpar!");
			}
		}
		else {
			if(N%2==0) {
				System.out.println("\nEste número é negativo e par!");
			}
			else {
				System.out.println("\nEste número é negativo e ímpar!");
			}
		}
		
	}

}
