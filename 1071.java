import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, v1, v2, sum=0;
		v1 = scan.nextInt();
		v2 = scan.nextInt();
		if(v1>v2){
			for(i=v1-1;i>v2;i--){

				if(i % 2== 1 ||i % 2== -1 ){
					sum = sum+i;
				}
			}
		}else{
			for(i=v1+1;i<v2;i++){

				if(i % 2== 1|| i % 2== -1){
					sum = sum+i;
				}
			}
		}
		System.out.println(sum);
	}
}