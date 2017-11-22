


import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int senha;
		do {
			senha = scan.nextInt();
			
			if(senha == 2002){
			System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha Invalida");
			}
		} while (senha != 2002);
	}

}
