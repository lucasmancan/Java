import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] v;
        v = new int[x];
        int a = 1, b = 0, c;
        for (int i = 1; i < x; i++) {

            c = a + b;

            v[i] = c;
            a = b;
            b = c;
        }
        v[0] = 0;
        
        for (int i = 0; i < x; i++) {
            
        if(i==(x-1)){
            System.out.println(v[i]);
        } else{
            System.out.print(v[i]+" ");
        } 

        }
    }
    
}