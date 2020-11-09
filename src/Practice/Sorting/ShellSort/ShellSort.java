package Practice.Sorting.ShellSort;


public class ShellSort {

	public static void main(String[] args) {
		int[] nums = { -1,0,3,6,2,1,0,5,6,7,8,-50,100 };
		ShellSort shellSort = new ShellSort();
		shellSort.sort(nums);
        shellSort.showArray(nums);

	}
	
	public void sort(int []nums){
		for(int gap =nums.length/2; gap>0; gap/=2){
			
			for(int i = gap; i<nums.length; i++){
				
				int j = i ;
				
				while(j >= gap && nums[j-gap] > nums[j]){
					swap(nums, j-gap, j) ;
					j = j - gap ;
				}
			}
		}
	}
	
	private void swap(int[] nums, int j, int i) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void showArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
