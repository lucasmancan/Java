import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
       
        int x = scan.nextInt();
         int f;
        
       
        f=x;
        while (x > 1){
          
           f = f * (x-1);
           x--;
        
        
       }
         if(x==0){
            f = 1;
           
        }
        System.out.println(f);
    }
}