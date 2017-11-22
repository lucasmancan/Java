import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, positivos=0;
		float[] vetor;
		float sum=0, media;
		vetor = new float[6];

		for(i=0;i<6;i++){
			vetor[i]= scan.nextFloat();
			if(vetor[i]> 0){
				positivos = positivos +1;
				sum = sum+ vetor[i];
			}
		}
		media = sum/positivos;
		System.out.println(positivos+" valores positivos");
		System.out.printf("%.1f\n",media);
	}
}
