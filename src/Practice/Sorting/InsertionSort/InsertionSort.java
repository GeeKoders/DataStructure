package Practice.Sorting.InsertionSort;

public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort insertionSort = new InsertionSort() ;
		int [] nums ={1, 4, 2, 0, -10, -5, 10, 100} ;
		
		insertionSort.sort(nums);
		insertionSort.showArray(nums);
		
	}

	public void sort(int[] nums) {

		for (int i = 1; i < nums.length; i++) {

			int j = i;

			while(j>0 && nums[j-1] > nums[j]){
				swap(nums, j-1, j) ;
				j-- ;
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
