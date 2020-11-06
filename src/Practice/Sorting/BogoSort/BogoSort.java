package Practice.Sorting.BogoSort;

public class BogoSort {

	public static void main(String[] args) {

		BogoSort app = new BogoSort() ;
		
		int[] nums= {12, -4, 56, 0, 3, 8, 2, 1} ;
		int counter = 0 ;
		
		while(!app.isSorted(nums)){
			counter++ ;
			app.shuffle(nums) ;
			
		}
		
		System.out.println("Steps required to sort array: " + counter);
		app.showArray(nums);
	}
	
	public void shuffle(int[]nums){
		
		for(int i=0; i<nums.length; i++){
			int j = (int)(Math.random() * i) ;
			swap(nums, i, j) ;
		}
	}
	
	public boolean isSorted(int[] nums){
		
		for(int i=0; i<nums.length - 1; i++){
			
			if(nums[i] > nums[i+1]){
				return false ;
			}
		}
		
		return true ;
	}
	
	public void swap(int[]nums, int i, int j){
		int temp = nums[i] ;
		nums[i] = nums[j] ;
		nums[j] = temp ;
	}
	
	public void showArray(int[] nums){
		
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i] + " ");
		}
	}
}
