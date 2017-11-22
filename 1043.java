import java.util.Scanner;
public class Main{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		float a,b, c, area, perimetro;
		a = scan.nextFloat();
		b = scan.nextFloat();
		c = scan.nextFloat();
		
		
		if ((a< b+c) & (b< a+c) & (c< b+a)){
			perimetro = (a+b+c);
			System.out.printf("Perimetro = %.1f", perimetro);
			
			}else{
				area = (c*(a+b))/2;
				System.out.printf("Area = %.1f", area);
			
			}
		

	}
}
