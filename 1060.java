import java.util.*;
public class Main{

	public static void main(String[]args){
		Scanner scan = new Scanner (System.in);
		int i, pares=0;
		float[] vetor;
		vetor = new float[6];

		for(i=0;i<6;i++){
			vetor[i]= scan.nextFloat();
			if(vetor[i]> 0){
				pares = pares+1;
			}

		}
		System.out.println(pares+" valores positivos");
	}
}