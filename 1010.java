import java.util.Scanner;


public class Main {
	public static void main(String[]args){


		int q1, q2, cod1, cod2;
		double p1, p2, total;
		Scanner scan = new Scanner(System.in); 
		//line 1
		cod1= scan.nextInt();
		q1= scan.nextInt();
		p1 = scan.nextDouble();
		// line 2
		cod2= scan.nextInt();
		q2= scan.nextInt();
		p2 = scan.nextDouble();
	
		total = (p1*q1)+ (p2*q2);
		


		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

	}
}