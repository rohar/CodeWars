package uk.co.royharrington.codewars;

import java.util.Arrays;

/**
 * AreSame contains method to test the multiplicity of two arrays
 * 
 * @author Roy
 *
 */
public class AreSame {
	/**
	 * 
	 * @param a
	 *            array containing base values
	 * @param b
	 *            array containing multiplicities of base values
	 * @return true if all base values in {@code a} have a corresponding square
	 *         value in {@code b}
	 */
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null) {
			return false;
		}

		int[] squares = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			squares[i] = a[i] * a[i];
		}
		
		Arrays.sort(squares);
		Arrays.sort(b);
		
		return Arrays.equals(squares,  b);
	}
}
