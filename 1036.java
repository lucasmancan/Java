import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		double a, b, c, Delta,x1, x2;


		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		Delta = (b*b)-4*a*c;
		if (Delta> 0 & a!=0 ){

			x1 = ((-b + Math.sqrt(Delta))/(2*a));
			x2 = ((-b - Math.sqrt(Delta))/(2*a));

			System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);

		}else {
			System.out.println("Impossivel calcular");

		}

	}
}