package uk.co.royharrington.codewars;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BraceChecker {
	public boolean isValid(String braces) {
		Map<Character, Character> bracePairs = new HashMap<>();
		bracePairs.put(')', '(');
		bracePairs.put(']', '[');
		bracePairs.put('}', '{');
		
		Deque<Character> stack = new ArrayDeque<>();
		
		for (int i = 0; i < braces.length(); i++) {
			char c = braces.charAt(i);
			if (bracePairs.containsValue(c)) {
				stack.push(c);
			} else if (bracePairs.containsKey(c)) {
				if (stack.isEmpty() || stack.pop() != bracePairs.get(c)) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}
