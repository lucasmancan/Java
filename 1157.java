import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        for(int i = 1; i<=x; i++){
            if(x % i == 0){
                System.out.println(i);
            }
        }
       
    }

}
