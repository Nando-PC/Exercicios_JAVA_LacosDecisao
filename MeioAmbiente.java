package Exercicios_aula;

import java.util.Scanner;

public class MeioAmbiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float indice;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor do índice de poluição ambiental entre 0 a 0,5: ");
		indice = ler.nextFloat();
		
		if(indice < 0 || indice > 1) {
			System.out.println("\nO valor do índice é inválido!!");
		}
		else {
			if(indice < 0.25) {
				System.out.println("\nO valor está aceitável");
			}
			else if(indice>=0.3 && indice < 0.4) {
				System.out.println("\nAs indústrias do 1º grupo devem ter suas atividades suspensas!!");
			}
			else if(indice >=0.4 && indice < 0.5) {
				System.out.println("\nAs indústrias do 1º e 2º grupos devem ter suas atividades suspensas!!");
			}
			else if(indice >= 0.5) {
				System.out.println("\nAs indústrias dos 1º, 2º e 3º grupos devem ter suas atividades suspensas!!");
			}
		}

	}

}
