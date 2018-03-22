package uk.co.royharrington.codewars;

/**
 * CodeWars - Catching Car Mileage Numbers
 * 
 * @author Roy
 *
 */
public class CarMileage {
	public static int isInteresting(int number, int[] awesomePhrases) {
		int result = 0;

		if (performTests(number, awesomePhrases)) {
			result = 2;
		} else if (performTests(number + 1, awesomePhrases)) {
			result = 1;
		} else if (performTests(number + 2, awesomePhrases)) {
			result = 1;
		}

		return result;
	}

	private static boolean performTests(int number, int[] awesomePhrases) {
		if (number < 100) {
			return false;
		}

		String s = "" + number;
		return isPalindrome(s) || isSameDigit(s) || isDigitFollowedByZeros(s) || isSequentialIncrementing(s)
				|| isSequentialDecrementing(s) || isAwesomePhrase(s, awesomePhrases);
	}

	private static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	private static boolean isSameDigit(String s, char digit) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != digit) {
				return false;
			}
		}

		return true;
	}

	private static boolean isSameDigit(String s) {
		char c = s.charAt(0);
		return isSameDigit(s, c);
	}

	private static boolean isDigitFollowedByZeros(String s) {
		String digits = s.substring(1);
		return isSameDigit(digits, '0');
	}

	private static boolean isSequentialIncrementing(String s) {
		int lastNum = getIncrementingDigit(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			int currNum = getIncrementingDigit(s.charAt(i));

			if (currNum != lastNum + 1) {
				return false;
			}
			lastNum = getIncrementingDigit(s.charAt(i));
		}

		return true;
	}

	private static int getIncrementingDigit(char c) {
		int value = c - '0';
		if (value == 0) {
			value = 10;
		}

		return value;
	}

	private static boolean isSequentialDecrementing(String s) {
		char lastChar = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != (char) (lastChar - 1)) {
				return false;
			}
			lastChar = s.charAt(i);
		}

		return true;
	}

	private static boolean isAwesomePhrase(String s, int[] awesomePhrases) {
		for (int i : awesomePhrases) {
			String awesomePhrase = "" + i;
			if (s.contains(awesomePhrase)) {
				return true;
			}
		}

		return false;
	}
}
