package Sort;

import java.util.Random;

public class BubbleSortTimeMessure {
	
	
	public static void main(String [] args){
		
		Random random = new Random() ;
		
		int [] num = new int[30000] ;
		
		for(int i=0; i<30000; i++){
			num[i] = random.nextInt() ; 
		}
		
		long start = System.currentTimeMillis() ;
		
		for(int i=0; i < num.length; i++){
			for(int j=1; j< num.length - i; j++){
				
				if(num[j-1] > num[j]){
					int tmp = num[j-1] ; 
					num[j-1] = num[j] ;
					num[j] = tmp ;
				}
			}
		}
		
		// O(N*N) N = 10000 2 -> 2*2 = 4 3 -> 3*3 = 9
		// O(N) linear search 2 -> 2 3 -> 3
		
		long end = System.currentTimeMillis() ;
		
		System.out.println("Bubble sort cost " + (end - start) + " ms");
		
	}
	
	
	
	
	
	

}
