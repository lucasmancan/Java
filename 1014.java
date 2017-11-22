import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int distancia;
		float comb , kmlitro;
		distancia = scan.nextInt();
		comb = scan.nextFloat();
		 kmlitro= (distancia / comb);
		 System.out.printf("%.3f km/l\n", kmlitro);
		
		}
}