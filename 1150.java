import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int z = scan.nextInt();
        int n = 0;
        int sum=0;
       
        int k=0;
        while(z<=x){
            z = scan.nextInt();
        }
        
        while(sum < z){
            sum = sum+ x+1;
            k++;
        }
        
        
        System.out.println(k);
        
        
     
    }
}
