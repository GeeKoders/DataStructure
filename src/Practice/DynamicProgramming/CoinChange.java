package Practice.DynamicProgramming;


public class CoinChange {
	
	
	public static void main(String[] args) {
		int[] v = {1, 2, 3} ;
		int M = 4 ;
		CoinChange change = new CoinChange() ;
		
//		System.out.println(change.nativeCoinChange(M, v, 0));
		change.dynamicProgrammingCoinChange(v, M) ;
	}

	//time complexity: O(2^N)
	public int nativeCoinChange(int M, int[]v, int index){
		
		
		if(M < 0) return 0 ;
		if(M == 0) return 1 ;
		
		if( v.length == index) return 0 ;
		
		return nativeCoinChange(M - v[index], v, index) + nativeCoinChange(M, v, index + 1) ;
		
	}
	
	//time complexity: O(v*M)
	public void dynamicProgrammingCoinChange(int[]v, int M){
		
		int [][]dpTable = new int[v.length+1][M+1] ;
		
		for(int i=0;i <=v.length; i++){
			dpTable[i][0] = 1 ;
		}
		
		for(int i=1; i<=M; i++){
			dpTable[0][i] = 0 ;
		}
		
		for(int i=1; i<=v.length; i++){
			
			for(int j=1; j<=M; j++){
				
				if(v[i-1] <= j){
					dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-v[i-1]] ;
				}else{
					dpTable[i][j] = dpTable[i-1][j] ;
				}
				
			}
			
		}
		
		System.out.println("Solution: " + dpTable[v.length][M]);
	}
	

}
