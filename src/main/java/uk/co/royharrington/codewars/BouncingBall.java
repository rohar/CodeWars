package uk.co.royharrington.codewars;

/**
 * Codewars class to solve Bouncing Balls Kata.
 * 
 * @author Roy Harrington
 *
 */
public class BouncingBall {
	/**
	 * Calculate the number of times a ball will be seen from a window of height
	 * {@code h} when dropped from height {@code h} when it loses {@code bounce}
	 * after hitting the ground
	 * 
	 * @param h
	 *            height ball is dropped by
	 * @param bounce
	 *            the amount of height lost on each bounce
	 * @param window
	 *            the height the window is at
	 * @return the number of times the ball will pass the window both up and down
	 */
	public static int bouncingBall(double h, double bounce, double window) {
		int result = -1;

		// first do basic validation
		if (h <= 0 || bounce < 0 || bounce >= 1 || h <= window) {
			return result;
		}

		/*-
		 * equation is: window = h * bounce^n, so to find n, 
		 * n = log(window / h) / log bounce
		 */
		int n = (int) (Math.log(window / h) / Math.log(bounce));

		// n iterations of bounce, each iteration is 2 sightings of ball + first initial
		// drop
		result = 2 * n + 1;

		return result;
	}
}
