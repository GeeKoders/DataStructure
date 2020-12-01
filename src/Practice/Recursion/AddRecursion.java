package Practice.Recursion;

public class AddRecursion {

	public static void main(String[] args) {

		AddRecursion addRecursion = new AddRecursion() ;
//		System.out.println(addRecursion.iterationSum(5));
		System.out.println(addRecursion.recursionSum(5));
		
	}
	
	public int iterationSum(int N){
		
		int result = 0 ;
		
		for(int i=0; i<=N; i++){
			result += i ;
		}
		
		return result ;
	}
	
	public int recursionSum(int N){
		
		if(N == 1) return 1 ;
		
		return N + recursionSum(N - 1) ;
		
	}
	
	
	

}
