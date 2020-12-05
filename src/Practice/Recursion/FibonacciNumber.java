package Practice.Recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		FibonacciNumber fibonacciNumber = new FibonacciNumber() ;
		System.out.println(fibonacciNumber.solve1(7)); 
		System.out.println(fibonacciNumber.solve2(7)); 
		
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
	
	
}
