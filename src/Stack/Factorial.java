package Stack;

import java.util.Scanner;

public class Factorial {

	private static int num ;
	
	public static void main(String[] args) {
		
		Factorial factor = new Factorial() ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("input your number:") ;
		num = sc.nextInt() ;
		
		int result = factor.factorial(num) ;
		
		System.out.println("result:" + result) ;
		
		
	}
	
	public int factorial(int num){
		
		if(num == 0)
			return 1 ;
		return num * factorial(num - 1) ;
		
	}
	
	
	
	

}
