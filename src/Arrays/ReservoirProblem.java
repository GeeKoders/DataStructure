package Arrays;

import java.util.Random;

public class ReservoirProblem {

	public static void main(String[] args) {

		int []num ={13, 65, 46, 11, 71, 50, 12, 5, 81, 97, 28, 74, 87, 68, 42, 31, 40, 37, 43, 25} ;
		int k =5 ;
		
		ReservoirProblem reservoir = new ReservoirProblem() ;
		reservoir.solve(num, k);
	
	}
	
	public void solve(int []num, int k){
		int [] reservoir = new int [k] ;
		// 1. copy 
		for(int i=0; i<reservoir.length; i++){
			reservoir[i] = num[i] ;
		}
		
		Random random = new Random() ;
		
		for(int i=k+1; i<num.length; i++){
			int j = random.nextInt(i) ;
			if(j<k) reservoir[j] = num[i] ;
		}
		
		for(int i=0; i<reservoir.length; i++){
			System.out.print(reservoir[i] + " ") ;
		}
	}

}
