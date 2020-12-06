package Practice.Search;

public class BinarySearch {

	public static void main(String[] args) {
		
		BinarySearch binarySearch = new BinarySearch(); 
		int []nums = {-5, 1, 3, 5, 10, 100} ;
		
		System.out.println(binarySearch.find(nums, 6));
		
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
	
}
