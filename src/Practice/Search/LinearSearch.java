package Practice.Search;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		LinearSearch linearSearch = new LinearSearch() ;
		int []nums = {1, 5, -5, 3, 10, 100} ;
		System.out.println(linearSearch.find(nums, -6));
		
	}
	
	
	public int find(int[] container, int item){
		
		//this is why the running time is O(N)!
		for(int index=0; index<container.length; index++){
		
			//this is when we find the given item
			if(container[index] == item){
				return index ;
			}
		}
		//this is the search miss when the item is not found
		return -1 ;
		
		
	}

}
