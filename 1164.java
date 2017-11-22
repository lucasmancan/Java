import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < x; i++) {
            sum = 0;
            int n = scan.nextInt();
            
            for (int j = 1; j < n-1; j++) {
                if (n % j == 0) {
                    sum += j;
                }
                
            }
            if (sum == n) {
                    System.out.println(n + " eh perfeito");
                } else {
                    System.out.println(n + " nao eh perfeito");
                }

        }

    }

}

