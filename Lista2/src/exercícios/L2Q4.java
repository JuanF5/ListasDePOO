package exercícios;

import java.util.Scanner;

public class L2Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = input.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double num2 = input.nextDouble();
		System.out.print("Digite o terceiro numero: ");
		double num3 = input.nextDouble();
		
		double maior = num1;
		
		if(num2>maior) {
			maior = num2;
		}
		else if(num3>maior) {
			maior = num3;
		}
		
		System.out.println(maior+" Eh o maior entre os 3 valores");
	}

}
