import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int vetor[], t, j = 0, i=0;
        vetor = new int[1001];

        Scanner scan = new Scanner(System.in);

        t = scan.nextInt();
        do{
            if(j==t){
                j=0;
            }
            vetor[i]= j;
            j++;
          i++;  
        }while(i<1001);
        
        for (i = 0; i < 1000; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
