package exercícios;

import java.util.Scanner;

public class L2Q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		double nota1 = input.nextDouble();
		System.out.println("Insira a segunda nota");
		double nota2 = input.nextDouble();
		
		double media = (nota1+nota2) / 2;
		System.out.println("Sua media foi : "+media);
		
		if(media==10) {
			System.out.println("Parabens, voce foi aprovado com distincao!");
		}
		else if(media>=7) {
			System.out.println("Parabens, voce foi aprovado!");
		}
		else {
			System.out.println("Reprovado.");
		}
	}

}
