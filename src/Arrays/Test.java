package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {

		// reverse1() ;
		// reverse2() ;
		// anagramProblem() ;
		// repeatedIntegerProblem() ;
		// lottoDraw() ;
		 reservoirProblem() ;

		
	}

	public static void reverse1() {

		int[] num = { 1, 2, 3, 4, 5 };

		int[] reverseNum = new int[num.length];

		for (int i = num.length - 1; i >= 0; i--) {
			reverseNum[num.length - 1 - i] = num[i];
		}

		for (int i = 0; i < reverseNum.length; i++) {
			System.out.print(reverseNum[i] + " ");
		}

	}

	public static void reverse2() {

		int[] num = { 1, 2, 3, 4, 5 };

		int startIndex = 0;
		int endIndex = num.length - 1;

		while (startIndex < endIndex) {

			int tmp = num[startIndex];
			num[startIndex] = num[endIndex];
			num[endIndex] = tmp;

			startIndex++;
			endIndex--;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public static void anagramProblem() {
		char[] firstWord = { 'a', 'b', 'c', 'd', 'e' };
		char[] secondWord = { 'c', 'e', 'a', 'b', 'b' };
		boolean isAnagram = true;

		if (firstWord.length != secondWord.length) {
			isAnagram = false;
		} else {
			Arrays.sort(firstWord);
			Arrays.sort(secondWord);

			for (int i = 0; i < firstWord.length; i++) {

				if (firstWord[i] != secondWord[i]) {
					isAnagram = false;
				}
			}
		}

		String result = ((isAnagram == true) ? "This is a anagram problem."
				: "This is not a anagram problem.");

		System.out.println(result);
	}

	public static void repeatedIntegerProblem() {

		// {0, 4, 2, 4, 1, 1} is bug
		// O(N)
		int[] num = { 2, 3, 1, 2, 4, 3 };
		for (int i = 0; i < num.length; i++) {

			if (num[Math.abs(num[i])] > 0) {
				num[Math.abs(num[i])] = -num[Math.abs(num[i])];
			} else {
				System.out.println(Math.abs(num[i]) + " is repeated");
			}

		}
	}
	
	public static void lottoDraw(){
		Random random = new Random();
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = random.nextInt(52) + 1;
			for (int j = 0; j < i; j++) {// duplicate check
				if (num[i] == num[j]) {// if duplicate, draw again
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public static void reservoirProblem(){
		int []num ={13, 65, 46, 11, 71, 50, 12, 5, 81, 97, 28, 74, 87, 68, 42, 31, 40, 37, 43, 25} ;
		int k =5 ;
		
		
		int [] reservoir = new int [k] ;
		// 1. copy 
		for(int i=0; i<reservoir.length; i++){
			reservoir[i] = num[i] ;
		}
		
		Random random = new Random() ;
		
		for(int i=k+1; i<num.length; i++){
			int j = random.nextInt(i) ;
			if(j<k) reservoir[j] = num[i] ;
		}
		
		for(int i=0; i<reservoir.length; i++){
			System.out.print(reservoir[i] + " ") ;
		}
	}
}
