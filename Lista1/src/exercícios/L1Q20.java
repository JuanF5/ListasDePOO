package exercícios;

import java.util.Scanner;

public class L1Q20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas horas voce trabalhou no mes? ");
		int horas = input.nextInt();
		System.out.println("Quanto voce ganha por hora? ");
		double ganhoporHora = input.nextDouble();
		
		double salarioBruto = ganhoporHora*horas;
		System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
		
		double INSS = (8.0 / 100) * salarioBruto;
		System.out.printf("Foram pagos ao INSS: R$%.2f\n", INSS);
		
		double sindicato = (5.0 / 100) * salarioBruto;
		System.out.printf("Foram pagos ao sindicato: R$%.2f\n", sindicato);
		
		double impostorenda = (11.0 / 100) * salarioBruto;
		System.out.printf("Foram pagos R$%.2f de imposto de renda", impostorenda);
		
		double salarioLiquido = salarioBruto-INSS-sindicato-impostorenda;
		System.out.printf("\nSalario liquido: R$%.2f", salarioLiquido);
		
	}

}
