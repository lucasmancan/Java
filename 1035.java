
import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
	
		int a, b, c, d, somaab, somacd;
		
	
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
			
			somacd = c+d;
			somaab = a+b;
			if(b>c & d>a & somacd>somaab & c>0 & d>0 & a%2==0){
				System.out.println("Valores aceitos");
			} else {
				System.out.println("Valores nao aceitos");
			}
		}
}