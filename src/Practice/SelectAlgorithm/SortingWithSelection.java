package Practice.SelectAlgorithm;

import java.util.Random;

public class SortingWithSelection {
	
	public static void main(String[] args) {
		
		int []nums ={-5, -1, 2, 3, 6} ;
		SortingWithSelection algorithm = new SortingWithSelection(nums) ;
		algorithm.sort();
	}
	
	private int[]nums ;

	public SortingWithSelection(int[] nums){
		this.nums = nums; 
	}
	
	public void sort(){
		for(int i=1; i<nums.length+1; i++){
			System.out.println(select(i)) ;
		}
	}
	
	public int select(int k){
		return select(0, nums.length-1, k-1) ;
	}
	
	public int select(int firstIndex, int lastIndex, int k){
		
		int pivot = partition(firstIndex, lastIndex) ;
		
		if(k > pivot){
			return select(pivot+1, lastIndex, k) ;
		}else if(k < pivot){
			return select(firstIndex, pivot-1, k) ;
		}
		
		return nums[k] ;
			
	}

	private int partition(int firstIndex, int lastIndex) {
		
		int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex ;
		
		swap(pivot, lastIndex) ;
		
		for(int i=firstIndex; i<lastIndex; i++){
			
			if(nums[i] > nums[lastIndex]){
				swap(i, firstIndex) ;
				firstIndex++ ;
			}
		}
		
		swap(firstIndex, lastIndex) ;
		
		return firstIndex ;
		
	}

	private void swap(int firstIndex, int lastIndex) {

		int temp = nums[firstIndex] ;
		nums[firstIndex] = nums[lastIndex] ;
		nums[lastIndex] = temp ;
	}

}
