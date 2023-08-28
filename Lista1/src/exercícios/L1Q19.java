package exercícios;

import java.util.Scanner;

public class L1Q19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		Double nota1 = input.nextDouble();
		System.out.println("Insira a segunda nota");
		Double nota2 = input.nextDouble();
		System.out.println("Insira a terceira nota");
		Double nota3 = input.nextDouble();
		System.out.println("Insira a quarta nota");
		Double nota4 = input.nextDouble();
		
		Double soma = nota1+nota2+nota3+nota4;
		Double media = soma/4;
		
		System.out.println("Media: "+media);

	}

}
