package uk.co.royharrington.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * "Delete occurrences of an element if it occurs more than n times" - Codewars
 * 
 * @author Roy Harrington
 *
 */
public class EnoughIsEnough {
	/**
	 * Remove duplicate elements from array when occurrences are >
	 * {@code maxOccurrences}
	 * 
	 * @param elements the int array
	 * @param maxOccurrences the maximum number of elements to tolerate
	 * @return array with the extra elements removed
	 */
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();

		for (int value : elements) {
			Integer valueOccurrences = occurrences.get(value);
			if (valueOccurrences == null) {
				valueOccurrences = 0;
			}

			if (valueOccurrences < maxOccurrences) {
				valueOccurrences++;
				occurrences.put(value, valueOccurrences);
				result.add(value);
			}
		}

		return result.stream().mapToInt(i -> i).toArray();
	}

}
