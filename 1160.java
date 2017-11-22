import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ncasos, pop1, pop2, k = 0, sec = 0;
        float cre1, cre2;

        ncasos = scan.nextInt();

        for (int i = 0; i < ncasos; i++) {
            k = 0;
            pop1 = scan.nextInt();
            pop2 = scan.nextInt();

            cre1 = scan.nextFloat();
            cre2 = scan.nextFloat();

            if (pop1<pop2) {
                while (pop2 >= pop1) {
                    if (k > 100) {

                        break;
                    }
                    pop1 = (int) (pop1 + (pop1 * (cre1 / 100)));
                    pop2 = (int) (pop2 + (pop2 * (cre2 / 100)));
                    k++;
                }
            }
            if (k > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(k + " anos.");
            }
        }

    }
}