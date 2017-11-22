import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		int a, b, i= 0;

		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a==b){
			i = 24-a+b;
		}else if(a>b){
			i= 24-a+b;
		}else {
			i=b-a;
		}
		

		System.out.printf("O JOGO DUROU %d HORA(S)\n", i);


	}
}

