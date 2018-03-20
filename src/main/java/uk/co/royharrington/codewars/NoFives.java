package uk.co.royharrington.codewars;

public class NoFives {
	public static int dontGiveMeFive(int start, int end) {
		int totalDigits = end - start + 1;
		
		int totalFives = 0;
		for (int i = start; i <= end; i++) {
			int numberToCheck = i;
			while (numberToCheck != 0) {
				int digit = Math.abs(numberToCheck) % 10;
				if (digit == 5) {
					totalFives++;
					break;
				}
				numberToCheck = numberToCheck / 10;
			}
		}
		
		int result = totalDigits - totalFives;
		
		return result;
	}
}
