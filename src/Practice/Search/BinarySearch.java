package Practice.Search;

public class BinarySearch {

	public static void main(String[] args) {
		
		BinarySearch binarySearch = new BinarySearch(); 
		int []nums = {-5, 1, 3, 5, 10, 100} ;
		
//		System.out.println(binarySearch.find(nums, 6));
		System.out.println(binarySearch.find2(nums, 3, 0, nums.length-1));
	}
	
	public int find(int[] nums, int item){
		
		int left = 0 ;
		int right = nums.length-1 ;
		
		while(left<=right){
			
			int middle = left + (right - left)/2 ;
			
			if(nums[middle] == item) return middle ;
			
			if(nums[middle] > item){
				right = middle - 1 ;
			}else{
				left = middle + 1 ;
			}
		}
		return -1 ;
	}
	
	public int find2(int[] container, int item, int left, int right){
		
		//this is the search miss when item is not present in the container
		if(right < left) return -1 ;
		
		int middle_index = (left + right) / 2 ;
		
		//we find the item we are looking for
		if(container[middle_index] == item) return middle_index ;
		
		//we have to check the item we are looking for is smaller or
		//greater than the middle_item
		if(container[middle_index] < item){
			//we can discard the left sub-array
			return find2(container, item, middle_index+1, right) ;
		}else{
			//item is smaller than the middle_item
			//we can discard the right sub-array
			return find2(container, item, left, middle_index-1) ;
			
		}
		
	}
	
}
