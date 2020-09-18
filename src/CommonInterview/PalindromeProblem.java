package CommonInterview;

public class PalindromeProblem {

	public static void main(String[] args) {
		PalindromeProblem algorithm = new PalindromeProblem() ;
		System.out.println(algorithm.solution1("bapab"));
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

}
