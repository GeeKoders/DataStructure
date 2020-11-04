package Practice.String;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString reverseString = new ReverseString() ;
//		System.out.println(reverseString.solution1("school"));
		
		System.out.println(reverseString.solution2("school"));
	}
	//O(N)
	public String solution1(String text){
		
		//use StringBuilder
		int lengthOfText = text.length();
		
		StringBuilder result = new StringBuilder(); 
		
		for(int i=lengthOfText-1; i>=0; i--){ //O(N)
			result.append(text.charAt(i)) ; //O(1)
		}
		
		return result.toString() ;
		
	}
	
	public String solution2(String text){
		
		char[] textChar= text.toCharArray() ;
		int left = 0 ;
		int right = textChar.length - 1 ;
		while(left<=right){
			
			swap(left, right, textChar) ;
			left++ ;
			right-- ;
		}
		StringBuilder sb = new StringBuilder() ;
		for(int i=0; i<textChar.length; i++){
			sb.append(textChar[i]) ;
		}
		
		return sb.toString() ;
		
	}
	private void swap(int left, int right, char[] textChar) {
		char tmp = textChar[left] ;
		textChar[left] = textChar[right] ;
		textChar[right] = tmp ;
	}

}
