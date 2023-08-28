package exercícios;

import java.util.Scanner;

public class L2Q7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o salario atual: R$");
		double salario = input.nextDouble();
		
		if(salario<=280) {
			double aumento = (20.0 / 100) * salario;
			System.out.println("Foram acrescentados 20% apos o reajuste. \nValor do aumento R$"+aumento);
			System.out.println("Salario apos o reajuste: R$"+(salario+aumento));
			
		}
		else if(salario>=281 && salario<=700) {
			double aumento = (15.0 / 100) * salario;
			System.out.println("Foram acrescentados 15% apos o reajuste. \nValor do aumento R$"+aumento);
			System.out.println("Salario apos o reajuste: R$"+(salario+aumento));
		}
		else if(salario>=701 && salario<=1500) {
			double aumento = (10.0 / 100) * salario;
			System.out.println("Foram acrescentados 10% apos o reajuste. \nValor do aumento R$"+aumento);
			System.out.println("Salario apos o reajuste: R$"+(salario+aumento));
		}
		else if(salario>=1501){
			double aumento = (5.0 / 100) * salario;
			System.out.println("Foram acrescentados 5% apos o reajuste. \nValor do aumento R$"+aumento);
			System.out.println("Salario apos o reajuste: R$"+(salario+aumento));
		}
		
		
	}

}
