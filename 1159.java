import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int sum, x, lim=0;
        
       do {
            x = scan.nextInt();
           
           sum=0;
           
           if(x==0){
               break;
           }else if (x % 2 ==0){
           for (int j =0; j<5;  j++){
             sum = sum +(x +(2*j));
              
           }
          }else {
               lim = x+1;
              for (int j =0; j<5; j++){
                 
                
                  sum = sum +(lim +(2*j));
                
              
           }
          }
          System.out.println(sum); 
       }while (x !=0);
             
        
       
    }

}