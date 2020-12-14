package Practice.CommonInterview;

public class Palindrome {

	
	public static void main(String[] args) {
		
		System.out.println(palidnrome1("ollo"));
		
		
	}

	public static boolean palidnrome1(String s){
		
		String reversed = "" ;
		
		int length = s.length() ;
		
		for(int i=0; i < length; i++){
			reversed = reversed + s.charAt(length - i - 1) ;
		}
		
		if(s.equals(reversed))
			return true ;
		
		return false ;
		
	}
	
	
}
