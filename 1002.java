package ex1002;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[]args){
	

		double A, r;
	Scanner scan = new Scanner(System.in); 
		
		r = scan.nextDouble();
		A = 3.14159 *r*r;

		
		System.out.printf("A=%.4f\n",A);
		
	}
}