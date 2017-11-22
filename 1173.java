import static java.lang.StrictMath.pow;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] v;
        v = new int[10];
        int n = scan.nextInt();
        
        for(int i= 0; i<10; i++){
            
           v[i]= (int) (n * pow(2, i));
            
        }
        for(int i= 0; i<10; i++){
            System.out.println("N["+(i)+"] = "+v[i] );
            
        }

    }

}

