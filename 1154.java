import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float m = 0;
        int idade, k=0;
        do {
            idade = scan.nextInt();
                if (idade >=0){
                k++;
                m = m + idade;
                }
           
        } while (idade >=0);
        m = m / k;

        System.out.printf("%.2f\n", m);
    }

}
