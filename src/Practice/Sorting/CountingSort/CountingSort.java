package Practice.Sorting.CountingSort;


public class CountingSort {

	int [] nums ;
	
	public static void main(String[] args) {
		
		int[] nums = { 2, 5, 3, 2, 2, 2, 4, 5 };

		CountingSort countingSort = new CountingSort(nums);
		countingSort.countingSort(2, 5);
		countingSort.showArray();
		
	}
	
	public CountingSort(int[] nums) {
		this.nums = nums ;
	}
	
	public void countingSort(int min, int max){
		
		int[] countArray = new int[ max - min + 1] ;
		
		for(int i=0; i<nums.length; i++){
			countArray[nums[i] - min] ++ ;
		}
		
		int z = 0 ;
		for(int i=min; i<=max; i++){
			while(countArray[i - min] > 0){
				nums[z] = i ;
				z++ ;
				countArray[i - min] -- ;
			}
		}
	}
	
	public void showArray(){
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i] + " ");
		}
	}
	
	
}
