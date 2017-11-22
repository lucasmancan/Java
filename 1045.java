
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		float a, b, c, aux;

		a = scan.nextFloat();
		b = scan.nextFloat();
		c = scan.nextFloat();


		if (a<b){
			aux = b;
			b = a;
			a = aux;
		}
		if(b<c){
			aux = c;
			c = b;
			b = aux;
		}
		if (a<b){
			aux = b;
			b = a;
			a = aux;
		}


		if (a >= b+c){
			System.out.println("NAO FORMA TRIANGULO");
		} else if (Math.pow(a, 2)== (Math.pow(b, 2)+Math.pow(c, 2))){
			System.out.println("TRIANGULO RETANGULO");
		}else if (Math.pow(a, 2)> (Math.pow(b, 2)+Math.pow(c, 2))){
			System.out.println("TRIANGULO OBTUSANGULO");
		}else if (Math.pow(a, 2)< (Math.pow(b, 2)+Math.pow(c, 2))){
			System.out.println("TRIANGULO ACUTANGULO");
		}


		if (a== b & b == c){
			System.out.println("TRIANGULO EQUILATERO");
		} 
		if (a== b & a != c || b== a & b != c || c== a & c != b || b ==c && b !=a ){
			System.out.println("TRIANGULO ISOSCELES");
		} 



	}
}
