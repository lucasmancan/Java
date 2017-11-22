import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n, j, i;
                int[] v1, v2, sum;
                n = scan.nextInt();
                v1 = new int[n];
                v2 = new int[n];
                sum = new int[n];
                for(j=0;j<n;j++){
                    
                
		v1[j] = scan.nextInt();
		v2[j] = scan.nextInt();
		if(v1[j]>v2[j]){
			for(i=v1[j]-1;i>v2[j];i--){

				if(i % 2== 1 ||i % 2== -1 ){
					sum[j] = sum[j]+i;
				}
			}
		}else{
			for(i=v1[j]+1;i<v2[j];i++){

				if(i % 2== 1|| i % 2== -1){
					sum[j] = sum[j]+i;
				}
			}
		}
		
	}
                for(j=0;j<n;j++){
                    System.out.println(sum[j]);
                }
}
}