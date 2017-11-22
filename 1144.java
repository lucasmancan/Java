package javaapplication1;

/**
 *
 * @author Mancan
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod = scan.nextInt();

        for (int i = 1; i <= cod; i++) {

            System.out.printf("%d ", i);
            System.out.printf("%d ", i * i);
            System.out.printf("%d\n", i * i * i);
            System.out.printf("%d ", i);
            System.out.printf("%d ", (i * i)+1);
            System.out.printf("%d\n", (i * i * i)+1);

        }

    }
}