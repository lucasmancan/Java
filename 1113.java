import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        do {
            a = scan.nextInt();
            b = scan.nextInt();
            if (a > b) {
                System.out.println("Decrescente");
            } else if (a < b) {
                System.out.println("Crescente");
            }
        } while (a != b);
    }

}
