import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int horas, velocidade;
		double litros;
		
		horas= scan.nextInt();
		velocidade= scan.nextInt();
		
		litros = (horas*velocidade)/12.0;
		
		 System.out.printf("%.3f\n", litros);
		
		}
}