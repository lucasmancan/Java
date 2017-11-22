import java.util.*;
public class Main{



	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int i, par=0, impar=0, positivo=0, neg=0;
		int[] vetor;
		vetor = new int[5];

		for(i=0;i<5;i++){
			vetor[i]= scan.nextInt();
			if(vetor[i] % 2== 0){
				par = par+1;
			}else{
				impar = impar+1;
			}
			if(vetor[i] >0){
				positivo = positivo+1;
			}else if(vetor[i] <0){
				neg = neg+1;
			}
		}
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(positivo+" valor(es) positivo(s)");
		System.out.println(neg+" valor(es) negativo(s)");
	}
}

