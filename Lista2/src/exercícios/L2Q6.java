package exercícios;

import java.util.Scanner;

public class L2Q6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Em que turno voce estuda? \n M-matutino \n V-vespertino \n N-noturno");
		String turno = input.next();
		switch(turno) {
		case "M": System.out.println("Bom dia!");
		break;
		case "V": System.out.println("Boa tarde!");
		break;
		case "N": System.out.println("Boa noite!");
		break;
		default: System.out.println("Valor invalido!");
		
		}
	}

}
