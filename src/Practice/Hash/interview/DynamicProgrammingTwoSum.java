package Practice.Hash.interview;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgrammingTwoSum {

	
	private int[] nums ;
	
	private int S; 
	
	private Map<Integer, Integer> hashTable ;
	
	public DynamicProgrammingTwoSum(int[] nums, int S) {
		this.nums = nums ;
		this.S = S ;
		this.hashTable = new HashMap<>() ;
	}
	
	public void solve(){
		
		for(int i=0; i<nums.length; i++){
			
			int reminder = S - nums[i] ;
			
			if(hashTable.containsValue(reminder)){
				System.out.println("Solution: " + nums[i] + "+" + reminder + "=" + S);
			}
			
			hashTable.put(i, nums[i]) ;
			
			
		}
		
	}
	
}
