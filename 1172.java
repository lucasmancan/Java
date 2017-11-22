import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] v;
        v = new int[10];
        
        for(int i= 0; i<10; i++){
            v[i]= scan.nextInt();
            if (v[i]==0 | v[i]<0){
             v[i]= 1;   
            }
            
        }
        for(int i= 0; i<10; i++){
            System.out.println("X["+(i)+"] = "+v[i] );
            
        }

    }

}