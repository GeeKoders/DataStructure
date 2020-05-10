package Strings;

import java.util.ArrayList;
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

	public List<String> getPrefixes(String text) {

		int lengthOftext = text.length(); // O(1)

		List<String> prefixList = new ArrayList<>();

		for (int index = 0; index < lengthOftext+1; ++index) {
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
