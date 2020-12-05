package Practice.Recursion;

public class Factorial {
	
	public static void main(String[] args) {
		
		Factorial factorial = new Factorial() ;
		System.out.println(factorial.solve(5));
		System.out.println(factorial.solve2(5, 1));
		System.out.println(factorial.solve3(5));
	}
	
	public int solve(int n){
		
		if (n==1) return 1 ;
		
		return n * solve(n - 1) ;
	}
	
	public int solve2(int n, int result){
		
		if(n==1) return result ;
		
		return solve2(n-1, n * result) ;
		
	}
	
	public int solve3(int n){
		
		if(n==1) return 1 ;
		
		int res = solve3(n-1) ;
		int result = n * res ;		
		return result ;
	}
	

}
