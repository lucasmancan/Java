

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[]args){
	

		double V, r;
	Scanner scan = new Scanner(System.in); 
		
		r = scan.nextDouble();
		V = ((4/3.0) * 3.14159) * (r*r*r);

		
		System.out.printf("VOLUME = %.3f\n",V);
		
	}
}