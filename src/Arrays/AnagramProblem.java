package Arrays;

import java.util.Arrays;

public class AnagramProblem {
	
	
	private static char [] firstWord = {'r', 'e', 's', 't', 'f', 'u', 'l'} ;
	private static char [] secondWord = {'s', 'e', 't', 'f', 'u', 'l', 'r'} ;
	private static char [] thirdWord = "geeksforgeeks".toCharArray() ;
	private static char [] fouthWord = "forgeeksgeeks".toCharArray() ;
	
	public static boolean checkAnagram(char [] firstWord, char [] secondWord){
	
		
		if(thirdWord.length != fouthWord.length) return false ;
		
		
		//O(NlogN)
		Arrays.sort(thirdWord) ;
		Arrays.sort(fouthWord) ;
		
		//O(N)
		for(int i=0; i<firstWord.length; i++){
			if(thirdWord[i] != fouthWord[i]){
				return false ;
			}
		}
		
		return true ;
	}
	
	public static void main(String [] args){
		
		boolean result = checkAnagram(thirdWord, fouthWord) ;	
		
		if(result){
			System.out.println("This is anagram problem") ; 
		}else{
			System.out.println("This is not anagram problem") ;
		}
		
		
	}
	
}
