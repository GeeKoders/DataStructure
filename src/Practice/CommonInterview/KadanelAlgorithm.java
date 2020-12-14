package Practice.CommonInterview;

public class KadanelAlgorithm {
	
	
	public static void main(String[] args) {
		
		int [] nums = {1, -2, 3, 4, -5, 8} ;
		
		KadanelAlgorithm kadanelAlgorithm = new KadanelAlgorithm() ;
		System.out.println(kadanelAlgorithm.solve(nums)) ;
	}
	
	public int solve(int [] nums){
		
		
		//initialize the algorithm with the first item in the array
		int max_global = nums[0] ;
		int max_current = nums[0] ;

		//it has an O(N) linear running time complexity
		for(int i=1; i<nums.length; i++){
			
			max_current = Math.max(nums[i], nums[i] + max_current) ;
			
			if(max_current > max_global){
				max_global = max_current ;
			}
			
		}
		
		return max_global ;
		
	}
	

}
