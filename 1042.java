
import java.util.Scanner;
public class Main{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int[] a, b;
		int i,j, aux;
		a = new int[3];
		b = new int[3];

		for(i=0;i<3;i++){
			a[i]  = scan.nextInt();		
			b[i]=a[i];
		}

		for(i=0;i<3;i++){
			for(j=i+1; j<3; j++)
				if(b[i]>b[j]){
					aux = b[i];
					b[i]= b[j];
					b[j]= aux;

				}
		}


		for(i=0;i<3;i++){
			System.out.println(b[i]);
		}
		System.out.println();

		for(i=0;i<3;i++){
			System.out.println(a[i]);
		}


	}
}