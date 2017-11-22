import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] v;
        v = new float[100];
        
        
        for(int i= 0; i<100; i++){
            
           v[i]= scan.nextFloat();
            
        }
        for(int i= 0; i<100; i++){
            if (v[i] <=  10){
                System.out.printf( "A[%d] = %.1f\n", i, v[i] );
            }
            
            
        }

    }

}