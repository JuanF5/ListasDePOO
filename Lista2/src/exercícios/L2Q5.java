package exercícios;

import java.util.Scanner;

public class L2Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int num1 = input.nextInt();
		System.out.print("Digite o segundo numero: ");
		int num2 = input.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int num3 = input.nextInt();
		
		int maior = num1;
		
		if(num2>maior) {
			maior = num2;
		}
		else if(num3>maior) {
			maior = num3;
		}
		
		int menor = num1;
		
		if(num2<menor) {
			menor = num2;
		}
		else if(num3<menor) {
			menor = num3;
		}
		
		System.out.println(maior+" Eh o maior entre os 3 valores");
		System.out.println(menor+" Eh o menor entre os 3 valores");
	}

}
