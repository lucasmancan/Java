import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, v;
		v = scan.nextInt();
		for(i=1;i<=v;i++){
			
			if(i % 2== 1){
				System.out.println(i);
			}
		}
		
	}
}