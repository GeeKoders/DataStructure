package recursion;

public class LinearSearch {

	private int[] array ;
	
	public static void main(String[] args) {
		int [] array = {1, 3, 4, 7, 8, 9, 10} ;
		LinearSearch linearSearch = new LinearSearch(array) ;
		System.out.println(linearSearch.binarySearch(4));
	}
	
	public LinearSearch(int []array){
		this.array = array ;
	}
	
	public int linearSearch(int item){
		
		for(int i=0; i<array.length; i++){
			if(array[i] == item){
				return i ;
			}
		}
		
		return -1 ;
		
	}
	
	public int binarySearch(int item){
		return binarySearch(0, array.length - 1, item) ;
	}
	
	public int binarySearch(int startIndex, int endIndex, int item){
		
		if(endIndex < startIndex){
			System.out.println("The item is not present in the array...");
			return -1 ;
		}
		
		int middleIndex = (startIndex + endIndex) / 2 ;
		
		if(item == array[middleIndex]){
			return middleIndex ;
		}
		
		if(item > array[middleIndex]){
			return binarySearch(middleIndex + 1, endIndex, item) ;
		}else{
			return binarySearch(startIndex, middleIndex - 1, item) ;
		}
		
	}

}
