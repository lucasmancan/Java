import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, i, sum=0;
		do {
			a = scan.nextInt();
			b = scan.nextInt();
                        
                        if(a<=0 || b<=0){
                            break;
                        }
				
			if (a > b) {

				for(i=b;i<=a;i++){
					sum = sum+i;
					System.out.print(i+" ");
				}
				System.out.print("Sum="+sum+"\n");
			} else if (a < b) {
				for(i=a;i<=b;i++){
					sum = sum+i;
					System.out.print(i+" ");
				}
				System.out.print("Sum="+sum+"\n");
			}
                        sum=0;
		} while (a > 0 && b> 0);
	}

}
