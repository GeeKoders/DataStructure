package Practice.Recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		FibonacciNumber fibonacciNumber = new FibonacciNumber() ;
		System.out.println(fibonacciNumber.solve1(6)); 
		System.out.println(fibonacciNumber.solve2(6)); 
		System.out.println(fibonacciNumber.solve3(6));
		System.out.println(fibonacciNumber.solve4(6));
		System.out.println(fibonacciNumber.solve5(6, 0, 1));
		
	}
	
	public int solve1(int n){
		
		if(n <= 1) return n ;
		
		return solve1(n-2) + solve1(n-1) ;
		
	}
	
	public int solve2(int n){
		
		if(n <= 1) return n ;
		
		int result = solve1(n-2) + solve1(n-1) ;
		
		return result ;
		
	}
	
	public int solve3(int n){
		
		if(n <= 1) return n ;
		
		int res = solve1(n-2) ;
		int result = res + solve1(n-1) ;
		
		return result ;
		
	}
	
	public int solve4(int n){
		
		if(n==0) return 0 ;
		if(n==1) return 1 ;
		
		int fib1 = solve4(n-1) ;
		int fib2 = solve4(n-2) ;
		int result = fib1 + fib2 ;
		
		return result ;
		
		
	}
	
	public int solve5(int n, int a, int b){
		
		if(n == 0) return a ;
		if(n == 1) return b ;
		
		return solve5(n-1, b, a+b) ;
		
	}
	
	
}
