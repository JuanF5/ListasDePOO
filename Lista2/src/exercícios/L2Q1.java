package exercícios;

import java.util.Scanner;

public class L2Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		Double num1 = input.nextDouble();
		System.out.println("Digite outro valor: ");
		Double num2 = input.nextDouble();
		
		if(num1>num2) {
			System.out.println(num1+" Eh maior que "+num2);
			
		}
		else {
			System.out.println(num2+" Eh maior que "+num1);
		}
		
		

	}

}
