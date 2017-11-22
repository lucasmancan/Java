import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alcool=0, gaso=0, diesel=0, cod;
        do{
            cod = scan.nextInt();
            while(cod != 1 & cod != 2 & cod != 3 & cod != 4 ){
                cod = scan.nextInt();
            }
             switch (cod){
                 case 1:
                        alcool = alcool+1;
                        break;
                 case 2: 
                     gaso = gaso+1;
                     break;
                 case 3:
                     diesel = diesel+1;
                     break;
                 
             }
            
        }while(cod != 4);
        System.out.printf("MUITO OBRIGADO\n" +
        "Alcool: %d\n" +
        "Gasolina: %d\n" +
        "Diesel: %d\n", alcool, gaso, diesel);
        

      }

}