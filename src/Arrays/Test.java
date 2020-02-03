package Arrays;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

//		reverse1() ;
//		reverse2() ;
//		anagramProblem() ;
		
		
		
	}
	
	public static void reverse1(){
		
		int [] num = {1, 2, 3, 4, 5} ;
		
		int [] reverseNum = new int [num.length] ;
		
		for(int i=num.length-1; i>=0; i--){
			reverseNum[num.length - 1 - i] = num[i] ;
		}
		
		for(int i=0; i< reverseNum.length; i++){
			System.out.print(reverseNum[i] + " ") ;
		}
		
	}
	
	public static void reverse2(){
		
		int [] num = {1, 2, 3, 4, 5} ;
		
		int startIndex = 0 ;
		int endIndex = num.length - 1 ;
		
		while(startIndex < endIndex){
			
			int tmp = num[startIndex] ; 
			num[startIndex] = num[endIndex] ;
			num[endIndex] = tmp ;
			
			startIndex ++ ;
			endIndex -- ;
		}
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + " ");
		}
	}
	
	public static void anagramProblem(){
		char []firstWord = {'a', 'b', 'c', 'd', 'e'} ; 
		char []secondWord = {'c', 'e', 'a', 'b', 'b'} ;
		boolean isAnagram = true ;
		
		if(firstWord.length != secondWord.length){
			isAnagram = false ;
		}else{
			Arrays.sort(firstWord) ;
			Arrays.sort(secondWord);
			
			for(int i=0; i<firstWord.length; i++){
				
				if(firstWord[i] != secondWord[i]){
					isAnagram = false ;
				}
			}
		}
		
		String result = ((isAnagram == true)?"This is a anagram problem.":"This is not a anagram problem.") ;
		
		System.out.println(result);
	}
	
}
