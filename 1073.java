import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, v, in=0, out=0;
		double q;
		int[] vetor;

		v = scan.nextInt();
		vetor = new int[v];
		for(i=1;i<=v;i++){
			if(i % 2 == 0){
				q = Math.pow(i,2);
				System.out.printf("%d^2 = %.0f\n",i,q);
			}


		}

	}

}
