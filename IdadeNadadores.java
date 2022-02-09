package Exercicios_aula;

import java.util.Scanner;

public class IdadeNadadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a idade do nadador: ");
		Idade = ler.nextInt();
		
		if(Idade>=5 && Idade <=7) {
			System.out.println("\nA categoria do nadador é Infantil A");
		}
		else if(Idade>7 && Idade <=11) {
			System.out.println("\nA categoria do nadador é Infantil B");
		}
		else if(Idade>11 && Idade <=13) {
			System.out.println("\nA categoria do nadador é Juvenil A");
		}
		else if(Idade>13 && Idade <=17) {
			System.out.println("\nA categoria do nadador é Juvenil B");
		}
		else if (Idade>17){
			System.out.println("\nA categoria do nadador é Adulta");
		}
		else {
			System.out.println("\nNão há categoria correspondente para esta idade");
		}

	}

}
