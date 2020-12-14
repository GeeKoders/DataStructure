package Practice.CommonInterview;

public class RepeatedIntegerProblem {

	public static void main(String[] args) {
		
		int[] array ={2, 3, 1, 2, 4, 3} ;
		
		RepeatedIntegerProblem repeatedIntegerProblem = new RepeatedIntegerProblem() ;
		repeatedIntegerProblem.solve(array);
	}
	
	// this is why it is an O(N) running time algorithm
	public void solve(int [] array){
		
		for(int i=0 ;i<array.length; i++){
			
			//if this value is positive we have to flip
			if(array[Math.abs(array[i])] > 0){
				array[Math.abs(array[i])] = -array[Math.abs(array[i])] ;
			//otherwise it is negative: it means repetition
			}else{
				System.out.println(Math.abs(array[i]) + " is a repitition!");
			}
			
		}
		
	}
	
}
