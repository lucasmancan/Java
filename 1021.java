package ex1002;


import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		double  centavos, umquarto, dezcentavos, cincocentavos, umcentavo;
		
		float  valor,cem, cinquenta, vinte, dez, cinco, dois, um;
	
			valor = scan.nextFloat();
		
		
		
		cem = (valor/100);
		cinquenta = (valor%100)/50;
		vinte = ((valor%100)%50)/20;
		dez = (((valor%100)%50)%20)/10;
		cinco = ((((valor%100)%50)%20)%10)/5;
		dois = (((((valor%100)%50)%20)%10)%5)/2;
		um = ((((((valor%100)%50)%20)%10)%5)%2)/1;
		centavos = (((((((valor%100)%50)%20)%10)%5)%2)%1)/0.50;
		umquarto = ((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)/0.25;
		dezcentavos = (((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10;
		cincocentavos = (((((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)/0.05);
		umcentavo = (((((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)%0.05)/0.01;
		
		System.out.printf("NOTAS:\n");
		 System.out.printf("%d nota(s) de R$ 100.00\n",(int) cem);
		 System.out.printf("%d nota(s) de R$ 50.00\n",(int) cinquenta);
		 System.out.printf("%d nota(s) de R$ 20.00\n",(int) vinte);
		 System.out.printf("%d nota(s) de R$ 10.00\n",(int) dez);
		 System.out.printf("%d nota(s) de R$ 5.00\n",(int) cinco);
		 System.out.printf("%d nota(s) de R$ 2.00\n", (int)dois);
		 
		 System.out.printf("MOEDAS:\n");
		 System.out.printf("%d moeda(s) de R$ 1.00\n", (int)um);
		 System.out.printf("%d moeda(s) de R$ 0.50\n", (int)centavos);
		 System.out.printf("%d moeda(s) de R$ 0.25\n",(int) umquarto);
		 System.out.printf("%d moeda(s) de R$ 0.10\n", (int)dezcentavos);
		 System.out.printf("%d moeda(s) de R$ 0.05\n", (int)cincocentavos);
		 System.out.printf("%.0f moeda(s) de R$ 0.01\n", umcentavo);
		
		}
}