package uk.co.royharrington.codewars;

public class MiddleExample {
	public static String getMiddle(String word) {
		int adjust = (word.length() + 1) % 2;
		int mid = word.length() / 2 - adjust;
		int end = mid + 1 + adjust;
		return word.substring(mid, end);
	}
}
