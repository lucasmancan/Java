

import java.util.Scanner;


public class Main {
	public static void main(String[]args){


		String name;
		double salario, vendas, total;
		Scanner scan = new Scanner(System.in); 

		name = scan.nextLine();
		salario = scan.nextDouble();
		vendas = scan.nextDouble();


		total = salario + (vendas*0.15);


		System.out.printf("TOTAL = R$ %.2f\n", total);

	}
}