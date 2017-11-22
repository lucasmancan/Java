
import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int valor, cem, cinquenta, vinte, dez, cinco, dois, um;
		
		
	
			valor = scan.nextInt();
		
		
		
		cem = (valor/100);
		cinquenta = (valor%100)/50;
		vinte = ((valor%100)%50)/20;
		dez = (((valor%100)%50)%20)/10;
		cinco = ((((valor%100)%50)%20)%10)/5;
		dois = (((((valor%100)%50)%20)%10)%5)/2;
		um = ((((((valor%100)%50)%20)%10)%5)%2)/1;
		
		System.out.printf("%d\n", valor);
		 System.out.printf("%d nota(s) de R$ 100,00\n", cem);
		 System.out.printf("%d nota(s) de R$ 50,00\n", cinquenta);
		 System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
		 System.out.printf("%d nota(s) de R$ 10,00\n", dez);
		 System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
		 System.out.printf("%d nota(s) de R$ 2,00\n", dois);
		 System.out.printf("%d nota(s) de R$ 1,00\n", um);
		
		}
}