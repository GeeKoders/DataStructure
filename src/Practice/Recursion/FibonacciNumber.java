package Practice.Recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		FibonacciNumber fibonacciNumber = new FibonacciNumber() ;
		System.out.println(fibonacciNumber.solve1(6)); 
		
	}
	
	public int solve1(int n){
		
		if(n <= 1) return n ;
		
		return solve1(n-2) + solve1(n-1) ;
		
	}
	
	
}
