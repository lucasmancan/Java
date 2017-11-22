package ex1002;

import java.util.Scanner;


public class Main {
	public static void main(String[]args){
	

		int num, horas;
		float valorh, salario;
	Scanner scan = new Scanner(System.in); 
		
		num = scan.nextInt();
		horas = scan.nextInt();
		valorh = scan.nextInt();
		
		
		salario = (valorh*horas);
		
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
	}
}