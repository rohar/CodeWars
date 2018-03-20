package uk.co.royharrington.codewars;

public class DuplicateEncoder {
	static String encode(String word) {
		StringBuilder sb = new StringBuilder(word.length());
		String wordLower = word.toLowerCase();
		
		for (int i = 0; i < wordLower.length(); i++) {
			char c = wordLower.charAt(i);
			if (wordLower.indexOf(c) == wordLower.lastIndexOf(c)) {
				sb.append('(');
			} else {
				sb.append(')');
			}
		}
		
		return sb.toString();
	}
}
