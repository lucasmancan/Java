import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, v;

		int[] vetor;

		v = scan.nextInt();
		vetor = new int[v];
		for(i=0;i<v;i++){
			vetor[i]= scan.nextInt();
		}
		for(i=0;i<v;i++){

			if(vetor[i] % 2 == 0 & vetor[i] > 0  ){
				System.out.println("EVEN POSITIVE");
			}else if(vetor[i] % 2 == 0 & vetor[i] < 0  ){
				System.out.println("EVEN NEGATIVE");
			}else if(((vetor[i] % 2 == 1)||(vetor[i] % 2 == -1)) & vetor[i] > 0  ){
				System.out.println("ODD POSITIVE");
			}else if(((vetor[i] % 2 == 1)||(vetor[i] % 2 == -1)) & vetor[i] < 0  ){
				System.out.println("ODD NEGATIVE");
			}else if(vetor[i] == 0  ){
				System.out.println("NULL");
			}


		}

	}
}
