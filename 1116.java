import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a, b, i;
       
        /*Logic*/
        
        for (i=0;i<n;i++){
            a = scan.nextInt();
            b = scan.nextInt();
            float div =  ((float) a/b);
            if (b == 0 ){
            System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f\n", div);
            }
            
        }
    }
}
    

