import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		int cod, quant;
		double preco = 0, total;


		cod = scan.nextInt();
		quant = scan.nextInt();
		
		if(cod == 1){
			preco = 4;
		}else if(cod == 2){
			preco = 4.50;
		}else if(cod == 3){
			preco = 5;
		}else if(cod == 4){
			preco = 2;
		}else if(cod == 5){
			preco = 1.50;
		}

		preco = preco *quant;
		System.out.printf("Total: R$ %.2f\n", preco);

	}			
}