package recursion;

public class Factorial {

	public static void main(String[] args) {

		Factorial factorial = new Factorial() ;
		System.out.println(factorial.factorial(4)) ;
		
	}
	
	public int factorial(int n){
		
		if(n == 1) return 1 ;
		
		return n * factorial(n-1) ;
		
	}

}
