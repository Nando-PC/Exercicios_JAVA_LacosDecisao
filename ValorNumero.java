package Exercicios_aula;

import java.util.Scanner;

public class ValorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro: ");
		N = ler.nextInt();
		
		if(N> 100) {
			System.out.println("\nO n�mero � maior que 100 e seu valor �: "+N);
		}
		else {
			N = 0;
			System.out.println(N);
		}

	}

}
