package Arrays;

public class RepeatedIntegersProblem {

	
	public static void repeatCheck(int []num){
		
		for(int i=0; i < num.length; i++){
			if(num[Math.abs(num[i])] > 0){
				num[Math.abs(num[i])] = - num[Math.abs(num[i])] ; 
			}else{
				System.out.println(Math.abs(num[i]) + " repeat !!!") ; 
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] num = {2, 1, 2, 4, 4, 3, 3} ; 
		repeatCheck(num) ;
		

	}

}
