import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int horas, minutos, segundos, input;
        Scanner scan  = new Scanner (System.in);
        
        input = scan.nextInt();
        
        horas = input/3600;
        minutos = (input%3600)/60;
        segundos = (input%3600)%60;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos)
      }
 
}