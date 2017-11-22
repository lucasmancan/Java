import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		float  n1, n2, n3, n4, notaexame;
		double media,mediafinal;
		
		n1 = scan.nextFloat();
		n2 = scan.nextFloat();
		n3 = scan.nextFloat();
		n4 = scan.nextFloat();
		
		media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		
		if(media>=7){
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno aprovado.");
			
			}else if(media >= 5 & media < 7){
				notaexame = scan.nextFloat();
				System.out.printf("Media: %.1f\n", media);
				System.out.println("Aluno em exame.");
				System.out.printf("Nota do exame: %.1f\n", notaexame);
				
				
				mediafinal = (media + notaexame)/2;
				if(mediafinal >= 5){
				System.out.println("Aluno aprovado.");
				}else {
					System.out.println("Aluno reprovado.");
				}
				System.out.printf("Media final: %.1f\n", mediafinal);
			}else {
				System.out.printf("Media: %.1f\n", media);
				System.out.println("Aluno reprovado.");
			}
	}
}