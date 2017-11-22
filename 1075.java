import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, n;

		n = scan.nextInt();

		
		for(i=1;i<=10000;i++){
			if(i % n==2){
				System.out.println(i);
			}

		}

	}
}
