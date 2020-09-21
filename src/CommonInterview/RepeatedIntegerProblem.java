package CommonInterview;

import java.util.HashSet;
import java.util.Set;

public class RepeatedIntegerProblem {

	public static void main(String[] args) {
		RepeatedIntegerProblem repeatedIntegerProblem = new RepeatedIntegerProblem() ;
		int []nums ={2, 3, 1, 2, 4, 3} ;
//		repeatedIntegerProblem.solution1(nums) ;
		repeatedIntegerProblem.solution2(nums) ;
	}
	
	public void solution1(int [] nums){
		
		Set<Integer> set = new HashSet<>() ;
		
		for(int i=0; i<nums.length; i++){
			
			if(set.contains(nums[i])){
				System.out.println(nums[i] + " is a repetition!");
			}else{
				set.add(nums[i]) ;
			}
		}
		
	}
	
	public void solution2(int []nums){
		
		for(int i=0; i<nums.length; i++){
			
			if(nums[Math.abs(nums[i])] > 0){
				nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])] ;
			}else{
				System.out.println(Math.abs(nums[i]) + " is a repetition!");
			}
		}
	}

}
