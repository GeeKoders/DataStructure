package recursion;

public class TailandHeadRecursion {

	public static void main(String[] args) {

		TailandHeadRecursion tailandHeadRecursion = new TailandHeadRecursion() ;
		
		tailandHeadRecursion.tail(5);
//		tailandHeadRecursion.head(5);
	}

	public void tail(int N){
		
		if(N == 1) return ;
		
		System.out.println(N);
		
		tail(N-1) ;
		
	}
	
	public void head(int N){
		
		if(N == 1) return ;
		
		head(N - 1) ;
		
		System.out.println(N);
	}
	
	
}
