import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        
        do{
        x = scan.nextInt();
     

        for (int i = 1; i <= x; i++) {
           if(i!= x){
               System.out.print(i+" ");
           } else{
               System.out.println(i);
           }   
        }
        
        
       
        }while(x != 0);
    }
}
