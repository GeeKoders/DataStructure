package Practice.Substring.BoyerMoore;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {

	private String text ;
	private String pattern ;
	private Map<Character, Integer> mismatchShiftTable ;
	
	public BoyerMoore(String text, String pattern) {
		this.text = text ;
		this.pattern = pattern ;
		mismatchShiftTable = new HashMap<>() ;
	}
	
	public void precomputeTable(){
		
		int lengthOfPattern = pattern.length();
		
		for(int index=0; index<lengthOfPattern; index++){
			char actualCharacter = this.pattern.charAt(index) ;
			int maxShift = Math.max(1, lengthOfPattern - index - 1) ;
			mismatchShiftTable.put(actualCharacter, maxShift) ;
		}
		
	}
	
	public int search(){
		
		int lengthOfText = text.length() ;
		int lengthOfPattern = pattern.length();
		int numOfSkips ;
		for(int i=0; i< lengthOfText - lengthOfPattern; i+=numOfSkips){
			
			numOfSkips = 0 ;
			for(int j=lengthOfPattern-1; j>=0; j--){
				
				if(pattern.charAt(j)!=text.charAt(j+i)){
					
					if(this.mismatchShiftTable.get(text.charAt(j+i)) != null){
						numOfSkips = this.mismatchShiftTable.get(text.charAt(j+i)) ;
						break ;
					}else{
						numOfSkips = lengthOfPattern ;
						break ;
					}
					
				}
				
				if(numOfSkips == 0){
					return i ;
				}
				
			}
			
		}
		
		return lengthOfText ;
		
	}
	
}
