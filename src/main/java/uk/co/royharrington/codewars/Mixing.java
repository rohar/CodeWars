package uk.co.royharrington.codewars;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * "Strings Mix" - Codewars
 * 
 * @author Roy Harrington
 *
 */
public class Mixing {
    public static String mix(String s1, String s2) {
        int[] s1CharLength = getCharacterCount(s1);
        int[] s2CharLength = getCharacterCount(s2);
        Map<Integer, Set<String>> lengthToStrings = new TreeMap<>(Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        
        // build map of length -> result strings within that length
        for (int i = 0; i < s1CharLength.length; i++) {
        	int max = Math.max(s1CharLength[i], s2CharLength[i]);
        	if (Math.max(s1CharLength[i], s2CharLength[i]) > 1) {
        		Set<String> stringsForLength = lengthToStrings.get(max);
        		if (stringsForLength == null) {
        			stringsForLength = new TreeSet<String>();
        			lengthToStrings.put(max,  stringsForLength);
        		}
        		
        		StringBuffer sb = new StringBuffer();
        		if (s1CharLength[i] > s2CharLength[i]) {
        			sb.append('1');
        		} else if (s2CharLength[i] > s1CharLength[i]) {
        			sb.append('2');        			
        		} else {
        			sb.append('=');
        		}
        		sb.append(':');
        		for (int j = 0; j < max; j++) {
        			sb.append((char)('a' + i));
        		}
        		stringsForLength.add(sb.toString());
        	}
        }

        // output results
        for (Set<String> stringsForLength : lengthToStrings.values()) {
        	for (String s : stringsForLength) {
        		if (result.length() > 0) {
        			result.append('/');
        		}
        		result.append(s);
        	}
        }
        
        return result.toString();
    }

    /**
     * Convert a String into an int array, each element representing the character count from 'a'-'z'
     * @param s string to convert
     * @return int[26] containing the character count for each character
     */
    private static int[] getCharacterCount(String s) {
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (Character.isLowerCase(c)) {
        		int pos = c - 'a';
        		charCount[pos]++;
        	}
        }
    	
        return charCount;
    }
}
