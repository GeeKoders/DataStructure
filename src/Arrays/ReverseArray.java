package Arrays;

public class ReverseArray {

	/*
	 * Reversing an array in-place solution O(N)
	 */
	
	public static int[]  reverseArray(int [] num){
		
		int startIndex = 0 ;
		int endIndex = num.length - 1 ; 
		
	    while (startIndex < endIndex){
	    	num = swap(num, startIndex, endIndex) ;
	    	startIndex ++ ;	    	
	    	endIndex -- ;
	    }
		
		return num ;
	}
	
	public static int [] swap(int []num,int startIndex,int endIndex){
		int tmp ;
		tmp = num[startIndex] ;
		num[startIndex] = num[endIndex] ;
		num[endIndex] = tmp ;
		
		return num ; 
		
	}
	
	public static void main(String agrs[]){
			
		int beforReverseNum[] = {5, 4, 3, 2, 1} ;
		
		int afterReverseNum[] = reverseArray(beforReverseNum) ;
		
		for(int i=0; i<afterReverseNum.length; i++){
		    System.out.println(afterReverseNum[i]) ; 
		}
		
	}
	
	
}
