package Exercicios_aula;

import java.util.Scanner;

public class MeioAmbiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float indice;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor do �ndice de polui��o ambiental entre 0 a 0,5: ");
		indice = ler.nextFloat();
		
		if(indice < 0 || indice > 1) {
			System.out.println("\nO valor do �ndice � inv�lido!!");
		}
		else {
			if(indice < 0.25) {
				System.out.println("\nO valor est� aceit�vel");
			}
			else if(indice>=0.3 && indice < 0.4) {
				System.out.println("\nAs ind�strias do 1� grupo devem ter suas atividades suspensas!!");
			}
			else if(indice >=0.4 && indice < 0.5) {
				System.out.println("\nAs ind�strias do 1� e 2� grupos devem ter suas atividades suspensas!!");
			}
			else if(indice >= 0.5) {
				System.out.println("\nAs ind�strias dos 1�, 2� e 3� grupos devem ter suas atividades suspensas!!");
			}
		}

	}

}
