package Arrays;

import java.util.Random;

public class LottoDraw {

	public static void main(String[] args) {
		
		int [] num =new int[6] ;
		
		num = lottery(num) ;
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + " ");
		}
	}
	
	public static int [] lottery(int []num){
		
		Random random = new Random() ;
		
		for(int i=0; i<num.length; i++){
			
			num[i] = random.nextInt(52) + 1 ;
			
			for(int j=0; j<i; j++){
				if(num[i] == num[j]){
					i-- ;
					break ;
				}
			}
		}
		
		return num ;
	}
}
