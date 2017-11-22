import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int r = 1;
        int g = 0;
        int inter=0 , gremio=0, empate=0;
        /*Declaration*/
        do{
            /*grenal*/
           int golInter = scan.nextInt();
            int golGremio = scan.nextInt();
            
            if(golInter>golGremio){
                inter = inter + 1;
            }else if (golGremio> golInter){
              gremio = gremio + 1;   
            }else {
                empate = empate + 1;
            }
                g = g+1;
            System.out.println("Novo grenal (1-sim 2-nao)");
           r = scan.nextInt();
           
      
        }while(r == 1);
        
        System.out.println(g+" grenais");
        System.out.println("Inter:"+ inter);
        System.out.println("Gremio:"+ gremio);
        System.out.println("Empates:"+ empate);
        if(inter>gremio){
            System.out.println("Inter venceu mais");   
        }else{
            System.out.println("Gremio venceu mais");   
        }

       }
    }
