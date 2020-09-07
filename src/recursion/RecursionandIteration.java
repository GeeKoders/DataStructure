package recursion;

public class RecursionandIteration {

	public static void main(String[] args) {

		RecursionandIteration recursionandIteration = new RecursionandIteration() ;
		
		System.out.println(recursionandIteration.iterationSum(5));
		System.out.println(recursionandIteration.recurrsionSum(5)) ;
		
	}
	
	public int iterationSum(int N){
		
		int sum = 0 ;
		for(int i=0; i<=N; i++){
			sum+=i ;
		}
		
		return sum ;
	}
	
	public int recurrsionSum(int N){
		
		if(N == 1) return 1 ;
		
		return N + recurrsionSum(N-1) ;
		
	}

}
