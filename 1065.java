import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, par=0;
		int[] vetor;
		vetor = new int[5];

		for(i=0;i<5;i++){
			vetor[i]= scan.nextInt();
			if(vetor[i] % 2== 0){
				par = par+1;
			}
		}
		System.out.println(par+" valores pares");
	}
}