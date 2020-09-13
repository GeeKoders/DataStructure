package DynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci() ;
		System.out.println(fibonacci.naiveFibonacci(5));
	}
	
	//it has exponential running time
	public int naiveFibonacci(int n){
		
		if(n == 0) return 0 ;
		if(n == 1) return 1 ;
		
		
		return naiveFibonacci(n - 1) + naiveFibonacci(n - 2) ;
		
	}
	

}
