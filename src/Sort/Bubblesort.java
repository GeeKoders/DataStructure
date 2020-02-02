package Sort;

public class Bubblesort {

	public static void main(String[] args) {
		
		int num [] = {3, 5, 7, 6, 4, 9, 1} ;
		
		for(int i=0; i< num.length; i++){
			for(int j=1; j<num.length-i; j++){
				if(num[j-1] > num[j]){
					
					int tmp = num[j-1] ;
					num[j-1] = num[j] ;
					num[j] = tmp ;
				}
			}
		}
		
		// O(N*N) quadratic running time
		
		for(int i=0; i < num.length ; i++){
			System.out.print(num[i] + " ") ;
		}
			
	}

}
