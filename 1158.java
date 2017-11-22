import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int sum=0, im,l;
        
        for(int i = 1; i<=n; i++){
           int x = scan.nextInt();
           int y = scan.nextInt();
           sum=0;
           l=0;
           im=0;
          if (x % 2 ==1){
           for (int j =0; j<y;  j++){
             im = x+(2*l); 
                  sum = sum + im;
                l++;
              
           }
          }else{
               x = x+1;
              for (int j =0; j<y; j++){
                 
                im = (x)+(2*l); 
                  sum = sum + im;
                l++;
              
           }
          }
            System.out.println(sum);  
        }
       
    }

}