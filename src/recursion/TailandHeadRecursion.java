package recursion;

public class TailandHeadRecursion {

	public static void main(String[] args) {

		TailandHeadRecursion tailandHeadRecursion = new TailandHeadRecursion() ;
		
//		tailandHeadRecursion.tail(5);
		tailandHeadRecursion.head(5);
	}
	//descending order
	public void tail(int N){
		
		if(N == 0) return ;
		
		System.out.println(N);
		
		tail(N-1) ;
		
	}
	//ascending order
	public void head(int N){
		
		if(N == 0) return ;
		
		head(N - 1) ;
		
		System.out.println(N);
	}
	
	
}
