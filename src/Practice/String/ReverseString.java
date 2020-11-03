package Practice.String;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString reverseString = new ReverseString() ;
		System.out.println(reverseString.solution1("school"));
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

}
