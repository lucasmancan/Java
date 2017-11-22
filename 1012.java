import java.util.*;

public class Main {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		
		double x,y, z, a, b, c, d, e;
		
		x = scan.nextDouble();
		y = scan.nextDouble();
		z = scan.nextDouble();
		
		a = (x*z)/2;
		b = 3.1415 * (z*z);
		c = (z *(x + y))/2; 
		d = y*y;
		e = x*y;
		
		System.out.printf("TRIANGULO: %.3f\n", a);
		System.out.printf("CIRCULO: %.3f\n", b);
		System.out.printf("TRAPEZIO: %.3f\n", c);
		System.out.printf("QUADRADO: %.3f\n", d);
		System.out.printf("RETANGULO: %.3f\n", e);
    }
	
}