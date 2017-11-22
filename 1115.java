import java.util.*;
/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[]args){
        float a, b, c, d;
        Scanner scan = new Scanner(System.in);
        do{
            /* variables declaration*/
        a = scan.nextFloat();
        b = scan.nextFloat();
        
        /*Lógic*/
        if(a>0 && b>0 ){
            System.out.println("primeiro");
        }else if (a>0 && b<0){
            System.out.println("quarto");
        }else if (a<0 && b<0){
            System.out.println("terceiro");
        }else if (a<0 && b>0){
            System.out.println("segundo");
        }
           }while(a != 0 && b!= 0);
        
    }
}
