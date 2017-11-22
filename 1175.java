import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] v;
        v = new int[20];
        int[] v2 = new int[20];
        
        for(int i= 0; i<20; i++){
            
           v[i]= scan.nextInt();
           
        }
        for(int i= 0; i<20; i++){
           v2[i]= v[19-i]; 
        }
        
        for(int i= 0; i<20; i++){
            System.out.printf("N[%d] = %d\n", i, v2[i]);
            
            }

    }

}