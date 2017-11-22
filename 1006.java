import java.util.Scanner;


public class Main {
	public static void main(String[]args){
	

		double media, a , b, c;
	Scanner scan = new Scanner(System.in); 
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		media = ((a*2)+(b*3)+(c*5))/10;

		
		System.out.printf("MEDIA = %.1f\n",media);
		
	}
}