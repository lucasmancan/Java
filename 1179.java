import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[], t, j = 0, i=0, b[], x=0;
        a = new int[5];
        b = new int[5];

        Scanner scan = new Scanner(System.in);

       
        for (i = j; j < 15; j++) {
           t = scan.nextInt();
           if(t % 2 == 0){
               a[i]= t;
               i++;
               if(i>4){
                   for (i = 0; i < 5; i++) {
             System.out.printf("par[%d] = %d\n", i, a[i]);
                a[i] = 0;
                }
                   i=0;
               }
           }else{
                b[x]= t;
               x++;
               if(x>4){
                   for (x = 0; x < 5; x++) {
             System.out.printf("impar[%d] = %d\n", x, b[x]);
             b[x] = 0;
                }
                   x=0;
               }
           }

       }
        for (x = 0; x < 5; x++) {
            if(b[x]!= 0){
             System.out.printf("impar[%d] = %d\n", x, b[x]);
                }
        }
        for (i = 0; i < 5; i++) {
            if(a[i]!= 0){
             System.out.printf("par[%d] = %d\n", i, a[i]);
                }
        }
        
    }
}
