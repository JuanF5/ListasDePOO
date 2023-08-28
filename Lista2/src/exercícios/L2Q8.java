package exercícios;

import java.util.Scanner;

public class L2Q8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas horas voce trabalhou no mes? ");
		int horas = input.nextInt();
		System.out.println("Quanto voce ganha por hora? ");
		double ganhoporHora = input.nextDouble();
		
		double salarioBruto = ganhoporHora*horas;
		System.out.println("Salario bruto: R$"+salarioBruto);
		
		if(salarioBruto<=900) {
			
			System.out.println("IR: isento");
			
			double INSS = (10.0 / 100) * salarioBruto;
			System.out.println("INSS (10%): R$"+ INSS);
			
			double FGTS = (11.0 / 100) * salarioBruto;
			System.out.println("FGTS (11%): R$"+ FGTS);
			
			System.out.println("Total de descontos: R$"+INSS);
			System.out.println("Salario Liquido: R$"+(salarioBruto-INSS));
		}
		else if(salarioBruto>=901 && salarioBruto<=1500) {
			
			double IR = (5.0 / 100) * salarioBruto;
			System.out.println("IR (5%): R$"+ IR);
			
			double INSS = (10.0 / 100) * salarioBruto;
			System.out.println("INSS (10%): R$"+ INSS);
			
			double FGTS = (11.0 / 100) * salarioBruto;
			System.out.println("FGTS (11%): R$"+ FGTS);
			
			System.out.println("Total de descontos: R$"+(IR+INSS));
			System.out.println("Salario Liquido: R$"+(salarioBruto-IR-INSS));
		}
		else if(salarioBruto>=1501 && salarioBruto<=2500) {
			
			double IR = (10.0 / 100) * salarioBruto;
			System.out.println("IR (10%): R$"+ IR);
			
			double INSS = (10.0 / 100) * salarioBruto;
			System.out.println("INSS (10%): R$"+ INSS);
			
			double FGTS = (11.0 / 100) * salarioBruto;
			System.out.println("FGTS (11%): R$"+ FGTS);
			
			System.out.println("Total de descontos: R$"+(IR+INSS));
			System.out.println("Salario Liquido: R$"+(salarioBruto-IR-INSS));
		}
		else if(salarioBruto>=2501) {
			
			double IR = (20.0 / 100) * salarioBruto;
			System.out.println("IR (20%): R$"+ IR);
			
			double INSS = (10.0 / 100) * salarioBruto;
			System.out.println("INSS (10%): R$"+ INSS);
			
			double FGTS = (11.0 / 100) * salarioBruto;
			System.out.println("FGTS (11%): R$"+ FGTS);
			
			System.out.println("Total de descontos: R$"+(IR+INSS));
			System.out.println("Salario Liquido: R$"+(salarioBruto-IR-INSS));
		}
	}

}
