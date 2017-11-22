import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        int anos, meses, dias, input;
        Scanner scan  = new Scanner (System.in);
        
        input = scan.nextInt();
        
        anos = input/365;
        meses = (input%365)/30;
        dias = (input%365)%30;
         System.out.printf("%d ano(s)\n", anos);
         System.out.printf("%d mes(s)\n", meses);
         System.out.printf("%d dia(s)\n", dias);
      }
 
}