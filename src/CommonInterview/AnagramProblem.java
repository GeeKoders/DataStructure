package CommonInterview;

import java.util.Arrays;

public class AnagramProblem {

	public static void main(String[] args) {

		AnagramProblem anagramProblem = new AnagramProblem() ;
		System.out.println(anagramProblem.solution1("restful", "fluster")) ;
		
	}
	
	//O(NlogN)
	public boolean solution1(String text1, String text2){
		
		
		if(text1.length() != text2.length()) return false ;
		
		char[] text1Char = text1.toCharArray() ;
		char[] text2Char = text2.toCharArray() ;
		
		
		Arrays.sort(text1Char) ;
		Arrays.sort(text2Char) ;
		
		for(int i=0; i<text1Char.length; i++){
			if(text1Char[i] != text2Char[i]) return false ;
		}
		
		return true ;
	}
}
