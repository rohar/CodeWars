package uk.co.royharrington.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Is my friend cheating? Codewars problem
 * 
 * @author Roy
 *
 */
public class RemovedNumbers {

	/**
	 * Given a the sum of a sequence, which set of 2 numbers can be removed from the
	 * sequence sum, and the product equals the sequence sum
	 * 
	 * @param n - sequence
	 * 
	 * @return List of long[] containing the number pairs
	 */
	public static List<long[]> removNb(long n) {
		List<long[]> result = new ArrayList<long[]>();
		final long sequenceSum = n * (n + 1) / 2;

		for (long b = n; b > 1; b--) {
			// formula to work out a given sum and b
			long a = (sequenceSum - b) / (b + 1);
			if (a <= n) { // a must be within the n range
				if (a * b == sequenceSum - a - b) { // check to see if formula works
					result.add(new long[] { a, b });
				}
			}
		}

		return result;
	}
}
