import java.util.Scanner;


public class Main {
	public static void main(String[]args){
	

		double media, a , b;
	Scanner scan = new Scanner(System.in); 
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		media = ((a*3.5)+(b*7.5))/11;

		
		System.out.printf("MEDIA = %.5f\n",media);
		
	}
}