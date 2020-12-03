package Practice.Recursion;

public class Factorial {
	
	public static void main(String[] args) {
		
		Factorial factorial = new Factorial() ;
		System.out.println(factorial.solve(5));
		
	}
	
	public int solve(int n){
		
		if (n==1) return 1 ;
		
		return n * solve(n - 1) ;
	}
	

}
