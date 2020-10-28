package Practice.Hash.interview;

public class NativeSolution {

	private int[] nums ;
	private int S ;
	
	public NativeSolution(int []nums, int S) {
		this.nums = nums ; 
		this.S = S ;
	}
	
	public void solve(){
		
		
		for(int i=0; i<nums.length; i++){
			
			for(int j=0; j<nums.length; j++){
				
				if(nums[i]+nums[j] == S){
					System.out.println("Solution: " + nums[i] + "+" + nums[j] + "=" + S);
				}
				
				
			}
			
			
		}
		
		
	}
	
	
}
