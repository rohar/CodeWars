package uk.co.royharrington.codewars;

/**
 * @author Roy
 * The TriangleTester contains methods to test the validity of triangles. 
 */
public class TriangleTester {
	/** 
	 * 
	 * Given the sides of a triangle, determine if the triangle is valid or not
	 *  
	 * @param a side 1
	 * @param b side 2
	 * @param c side 3
	 * @return true if the triangle is valid, false if invalid.
	 */
	public static boolean isTriangle(int a, int b, int c) {
		int maxSide;
		int minSide1, minSide2;

		if (a > b || a > c) {
			maxSide = a;
			minSide1 = b;
			minSide2 = c;
		} else {
			minSide1 = a;
			if (b > c) {
				maxSide = b;
				minSide2 = c;
			} else {
				maxSide = c;
				minSide2 = b;
			}
		}
		
		return (minSide1 + minSide2 > maxSide);
	}
}
