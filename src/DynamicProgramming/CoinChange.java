package DynamicProgramming;

public class CoinChange {

	public static void main(String[] args) {

		int[] v = {1, 2, 3} ;
		int M = 4 ;
		CoinChange change = new CoinChange() ;
		
		System.out.println(change.naiveCoinChange(M, v, 0));
		
	}
	
	// recursive coin change EXPONENTIAL RUNNING TIME O(2^N)
	public int naiveCoinChange(int M, int[] v, int index){
		
		if(M < 0 ) return 0 ;
		if(M == 0) return 1 ;
		if(v.length == index ) return 0 ;
		// we take coin + we don't take coin
		return naiveCoinChange(M - v[index], v, index) + naiveCoinChange(M, v, index + 1) ;
		
	}

}
