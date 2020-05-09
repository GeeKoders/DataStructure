package BoyerMoore;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {

	private String text;
	private String pattern;
	private Map<Character, Integer> mismatchShiftTable;

	public BoyerMoore(String text, String pattern) {
		this.text = text;
		this.pattern = pattern;
		mismatchShiftTable = new HashMap<>();
	}

	//mismatch table
	public void precomputeTable() {

		int lengthOfPattern = this.pattern.length();

		for (int index = 0; index < lengthOfPattern; index++) {
			char actualCharacter = this.pattern.charAt(index);
			int maxShift = Math.max(1, lengthOfPattern - index - 1);
			this.mismatchShiftTable.put(actualCharacter, maxShift);
		}

	}

	public int search() {

		int lengthOfPattern = this.pattern.length();
		int lengthOfText = this.text.length();
		int numOfSkips;

		for (int i = 0; i < lengthOfText - lengthOfPattern; i += numOfSkips) {

			numOfSkips = 0;

			for (int j = lengthOfPattern - 1; j >= 0; j--) {

				if (pattern.charAt(j) != text.charAt(j + i)) {

					if (this.mismatchShiftTable.get(text.charAt(j + i)) != null) {
						numOfSkips = this.mismatchShiftTable.get(text.charAt(j
								+ i));
						break;
					} else {
						numOfSkips = lengthOfPattern;
						break;
					}

				}

				if (numOfSkips == 0)
					return i;

			}
		}

		return lengthOfText;
	}

}
