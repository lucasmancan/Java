import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double S = 0;
        for( int i = 1 ; i <= 100; i++){
            S = S + (1.00/i);
        }
       

        System.out.printf("%.2f\n", S);
    }

}