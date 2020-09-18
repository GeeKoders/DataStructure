package CommonInterview;

public class IntegerReversionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntegerReversionProblem algorithm = new IntegerReversionProblem(); 
		
		System.out.println(algorithm.solution1(4321)) ;
		
	}
	
	public Integer solution1(Integer number){
		
		if(number == null) return null ;
		
		char[] num = Integer.toString(number).toCharArray() ;
		
		int i = 0 ;
		int j = num.length - 1 ;
		
		while(i<=j){
			swap(num, i++, j--) ;
		}
		
		StringBuilder sb = new StringBuilder() ;
		
		for(int index=0; index<num.length; index++){
			sb.append(num[index]) ;
		}
		
		return Integer.parseInt(sb.toString()) ;
		
	}
	
	public void swap(char [] num, int i, int j){
		char tmp = num[i] ;
		num[i] = num[j] ;
		num[j] = tmp ;
	}
	

}
