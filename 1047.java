
import java.util.Scanner;
public class Main{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		int horaini,mininici,horafinal, minutofinal;
		horaini = scan.nextInt();
		mininici = scan.nextInt();
		horafinal = scan.nextInt();
		minutofinal = scan.nextInt();



		if (horaini >= horafinal){
			if(mininici >= minutofinal ){
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24-horaini+horafinal,mininici-minutofinal);
			}else if(mininici < minutofinal ) {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24-horaini+horafinal,minutofinal-mininici);
			}
		}else {
			if(mininici >= minutofinal ){
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",  (horafinal-horaini)-(horafinal-horaini),60-mininici+minutofinal);
			}else if(mininici < minutofinal ) {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horafinal-horaini,minutofinal-mininici);
			}


		}
	}
}
package Treinamento_1;
import java.util.Scanner;
public class Main{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		int horaini,mininici,horafinal, minutofinal,h=0, m=0;
		horaini = scan.nextInt();
		mininici = scan.nextInt();
		horafinal = scan.nextInt();
		minutofinal = scan.nextInt();

		

		if (((horaini*60)) > ((horafinal*60))){
			h= 24-horaini + horafinal;
			
			
			
		}else if (((horaini*60)) < ((horafinal*60))){
			h= horafinal-horaini;
			
			
			
		}else if (((horaini*60)) == ((horafinal*60))){
			h= 24-horaini + horafinal;
			
			
			
		}
		
		if (((mininici)) > ((minutofinal))){
			m = Math.abs(60-mininici+minutofinal);
			
			
			
		}else if (((mininici)) < ((minutofinal))){
			m =minutofinal - mininici;
			
			
			
		}else if (((mininici)) == ((minutofinal))){
			m= 0;
			
			
			
		} 
		if (h==24 & m>0){
			h = h-1;
		}
		if ()
		/////////////////////////////////
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h,m);
	}
}