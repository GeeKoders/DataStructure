package Practice.CommonInterview;

public class Palindrome {

	
	public static void main(String[] args) {
		
		System.out.println(palindrome1("olloh"));
		System.out.println(palindrome2("olloh"));
		System.out.println(palindrome3("olloh"));
	}

	public static boolean palindrome1(String s){
		
		String reversed = "" ;
		
		int length = s.length() ;
		
		for(int i=0; i < length; i++){
			reversed = reversed + s.charAt(length - i - 1) ;
		}
		
		if(s.equals(reversed))
			return true ;
		
		return false ;
		
	}
	
	public static boolean palindrome2(String s){
		
		int i = 0 ;
		int j = s.length() - 1 ;
		int k = (i+j)/2 ;
		
		for(int index =i ; index <=k; index ++){
			
			if(s.charAt(i) == s.charAt(j)){
				i++ ;
				j-- ;
			}else{
				return false ;
			}
			
		}
		
		return true ;
		
	}
	
	public static boolean palindrome3(String s){
		
		
		int i = 0 ;
		int j = s.length() - 1 ;
		int k = (i+j)/2 ;
		
		while(i<=k){
			
			if(s.charAt(i) != s.charAt(j)){
				return false ;
			}else{
				i++ ; 
				j-- ;
			}
			
			
		}
		
		return true ;
	}
	
}
