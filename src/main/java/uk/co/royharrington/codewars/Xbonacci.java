package uk.co.royharrington.codewars;

public class Xbonacci {
	public double[] tribonacci(double[] s, int n) {
		double[] result = new double[n];
		
		// copy initial values
		for (int i = 0; i < (n < 3 ? n : 3); i++) {
			result[i] = s[i];
		}
		
		// create result
		for (int i = 3; i < n; i++) {
			double d1 = result[i - 3];
			double d2 = result[i - 2];
			double d3 = result[i - 1];
			double dNew = d1 + d2 + d3;
			result[i] = dNew;
		}
		
		return result;
	}
}
