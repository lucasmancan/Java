import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  n ;
        long c, a, b;

        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            a = 0;
            b = 1;
            c = 0;

            n = scan.nextInt();

            for (int j = 0; j < n; j++) {
                c = a + b;
                b = a;
                a = c;

            }

            System.out.printf("Fib(%d) = %d\n", n, c);
        }

    }

}
