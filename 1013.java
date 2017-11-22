package ex1002;

import java.util.*;

public class Main {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, maiorab, maiortotal;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		maiorab = (a+b+Math.abs(a-b))/2;
		maiortotal = (maiorab+ c + Math.abs(maiorab-c))/2;
		System.out.printf("%d eh o maior\n", maiortotal);
		
    }
	
}