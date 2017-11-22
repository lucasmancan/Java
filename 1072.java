import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, v, in=0, out=0;
		int[] vetor;
		
		v = scan.nextInt();
		vetor = new int[v];
		for(i=0;i<v;i++){
			vetor[i] = scan.nextInt();
			if(vetor[i]>=10 && vetor[i]<=20){
				in = in+1;
				
			}else{
				out = out+1;
			}
			
			}
		System.out.println(in+" in");
		System.out.println(out+" out");
		}
		
	}
