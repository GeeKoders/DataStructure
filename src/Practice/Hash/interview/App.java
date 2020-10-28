package Practice.Hash.interview;

import twosum.DynamicProgrammingTwoSum;

public class App {

	public static void main(String[] args) {

		int []nums = {3, 5, 2, -4, 8, 11} ;
		int S = 7 ;
		
//		NativeSolution nativeSolution = new NativeSolution(nums, S) ;
//		nativeSolution.solve() ;
		
		DynamicProgrammingTwoSum dynamicProgrammingTwoSum = new DynamicProgrammingTwoSum(nums, S) ;
		dynamicProgrammingTwoSum.solve();
	}

}
