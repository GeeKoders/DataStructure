package Strings;

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

}
