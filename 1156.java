import static java.lang.StrictMath.pow;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double S = 0;
        int k=0;
           double x;
        for( int i = 1 ; i <= 39; i= i+2){
          x = (double) pow(2, k);
            
            S = S + (double)(i/x);
            k++;
            
        }
       

        System.out.printf("%.2f\n",(double) S);
       
    }

}