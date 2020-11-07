package Practice.Sorting.BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		
		BubbleSort bubbleSort = new BubbleSort() ;
		int [] nums = {12, 7, -5, -77, 102} ;
		bubbleSort.sort(nums);
		bubbleSort.showArray(nums);
		
	}
	
	public void sort(int[] nums){
		
		for(int i=0; i<nums.length-1 ; i++){
			for(int j=0 ; j<nums.length-1-i; j++){
				
				if(nums[j]>nums[j+1]){
					swap(nums, j, j+1) ;
				}
			}
		}
	}

	private void swap(int[] nums, int j, int i) {
		
		int temp = nums[i] ;
		nums[i] = nums[j] ;
		nums[j] = temp ;
	}
	
	public void showArray(int []nums){
		
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i] + " ");	
		}
	}

}
