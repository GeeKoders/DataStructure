package CommonInterview;

public class PalindromeProblem {

	public static void main(String[] args) {
		PalindromeProblem algorithm = new PalindromeProblem() ;
		System.out.println(algorithm.solution3("abcba"));
	}
	
	public boolean solution1(String text){
		
		//base case
		if(text == null || text.length() == 0) return false ;
		
		int i = 0 ;
		int j = text.length()-1;
		
		while(i<=j){
			if(text.charAt(i++) != text.charAt(j--)){
				return false ;
			}
		}
		
		return true ;
		
	}
	
	public boolean solution2(String text){
		
		String reversed = "" ;
		int length = text.length() ;
		
		for(int i=0; i< length; i++){
			
			reversed = reversed + text.charAt(length - i - 1) ;
		}	
		if(text.equals(reversed)){
			return true ;
		}
		
		return false ;
	}
	
	public boolean solution3(String text){
		
		int i = 0 ;
		int j = text.length() - 1 ;
		int k = (i + j)/2 ;
		
		for(int index = i; index<=k; index++){
			
			if(text.charAt(i) == text.charAt(j)){
				i++ ;
				j-- ;
			}else{
				return false ;
			}
			
		}
		
		return true ;
		
	}

}
