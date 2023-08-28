package exercícios;

import java.util.Scanner;

public class L2Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		Double num1 = input.nextDouble();
		
		if(num1>0) {
			System.out.println(num1+" Eh positivo");
			
		}
		else {
			System.out.println(num1+" Eh negativo ");
		}
	}

}
