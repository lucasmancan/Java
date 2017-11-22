
import java.util.Scanner;
public class Main{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String p1= scan.nextLine();
		String p2= scan.nextLine();
		String p3= scan.nextLine();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		if(p1.equals("vertebrado")){
			if(p2.equals("ave")){
				if(p3.equals("carnivoro")){
					System.out.println("aguia");
				}else{
					System.out.println("pomba");
				}
			}else{
				if(p3.equals("onivoro")){
					System.out.println("homem");
				}else{
					System.out.println("vaca");

				}
			}
		}else {
			if(p2.equals("inseto")){
				if(p3.equals("hematofago")){
					System.out.println("pulga");
				}else{
					System.out.println("lagarta");
				}
			}else{
				if(p3.equals("onivoro")){
					System.out.println("sanguessuga");
				}else{
					System.out.println("minhoca");

				}
			}
		}
	}
}
// usar p variavel.equals(variavel2); para comparar as palavras