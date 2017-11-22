import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int div;

        for (int i = 0; i < x; i++) {
            div= 0;
            int n = scan.nextInt();
            
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    div++;
                }
                
            }
            if (div > 2) {
                    System.out.println(n + " nao eh primo");
                } else {
                    System.out.println(n + " eh primo");
                }

        }

    }

}
