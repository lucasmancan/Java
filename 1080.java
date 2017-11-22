import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int i, maior=0, j=0;	
	 int[] n;
	 n= new int[100];
	 
	 for(i=0;i<100;i++){
		 n[i] = scan.nextInt();
		 
	 }
	 
	 for(i=0;i<100;i++){
		 if(n[i]>maior){
			 maior = n[i];
			 j=i;
		 }
		 
	 }
		System.out.println(maior);
		System.out.println(j+1);
	}

}
