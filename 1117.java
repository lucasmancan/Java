import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        /*Declaration*/
        
        float a = scan.nextFloat();
        while (a < 0 || a >10){
            System.out.println("nota invalida");
          a = scan.nextFloat();   
        }
        float b = scan.nextFloat();
         while (b < 0 || b >10){
             System.out.println("nota invalida");
          b = scan.nextFloat();   
        }
       /*Logic*/
         float m = (float) (a+ b)/2;
         
         System.out.printf("media = %.2f\n", m);
        
        
            
        }
    }

    