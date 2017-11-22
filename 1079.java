import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	 int n = scan.nextInt();
	 int i;
	 float[] v1, v2, v3;
	 double[] media;
	 v1 = new float[n];
	 v2 = new float[n];
	 v3 = new float[n];
	 media = new double[n];
	 
	 
	 for(i=0;i<n;i++){

			 v1[i]=scan.nextFloat();
			 v2[i]=scan.nextFloat();
			 v3[i]=scan.nextFloat();
			 media[i] = ((v1[i]*2)+ (v2[i]*3)+(v3[i]*5))/10;
		
		 
	 }
	 for(i=0;i<n;i++){
		 System.out.printf("%.1f\n",media[i]);
	 }
		
	}

}
