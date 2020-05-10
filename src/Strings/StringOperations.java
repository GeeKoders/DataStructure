package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {

	public String reverseString(String text) {

		// String --> O(N*N) StringBuilder --> O(N)
		int lengthOftext = text.length(); // O(1)
		StringBuilder reversedString = new StringBuilder();

		for (int index = lengthOftext - 1; index >= 0; index--) { // O(N)
			reversedString.append(text.charAt(index)); // O(1) O(N) + O(1) =
														// O(N)
		}
		return reversedString.toString();

	}

	public String longestRepeatedSubstirng(String text){
		
		int lengthOfText = text.length();
		
		List<String> suffixList = getSuffixes(text); // O(N)
		
		Collections.sort(suffixList); // O(NlogN) BUT O(N)
		
		String longestSubstring = "";
		
		for(String s: suffixList){
			System.out.println(s);
		}
		
		
		for(int i=0;i<lengthOfText-1;i++){
			String tempString = longestCommonPrefix(suffixList.get(i), suffixList.get(i+1));
			
			if( tempString.length() > longestSubstring.length()){
				longestSubstring = tempString;
			}
		}
		
		return longestSubstring;
	}

	// O(N) !!!
	public String longestCommonPrefix(String text1, String text2) {

		int commonLength = Math.min(text1.length(), text2.length());

		for (int index = 0; index < commonLength; ++index) {

			if (text1.charAt(index) != text2.charAt(index)) {
				return text2.substring(0, index); // O(1)
			}

		}

		return text2.substring(0, commonLength);

	}

	public List<String> getPrefixes(String text) {

		int lengthOftext = text.length(); // O(1)

		List<String> prefixList = new ArrayList<>();

		for (int index = 0; index < lengthOftext + 1; ++index) {
			prefixList.add(text.substring(0, index)); // O(1) !!!
		}

		return prefixList;

	}

	public List<String> getSuffixes(String text) {

		int lengthOftext = text.length(); // O(1)

		List<String> suffixesList = new ArrayList<>();

		for (int index = 0; index < lengthOftext; ++index) {
			suffixesList.add(text.substring(index, lengthOftext)); // O(1) !!!
		}

		return suffixesList;

	}

}
