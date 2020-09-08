package recursion;

public class Factorial {

	public static void main(String[] args) {

		Factorial factorial = new Factorial() ;
//		System.out.println(factorial.factorial(4)) ;
		
		System.out.println(factorial.calculateFactorial(4));
		
	}
	
	public int factorial(int n){
		
		if(n == 1) return 1 ;
		
		return n * factorial(n-1) ;
		
	}
	
	public int calculateFactorial(int n){
		return factorial2(1, n) ;
	}

	private int factorial2(int accumulator, int n) {

		if(n == 1) return accumulator ;
		
		return factorial2(accumulator*n, n - 1) ;
	
	
	}

}
