package uk.co.royharrington.codewars;

public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		int hh = seconds / 3600;
		int mm = (seconds - (hh * 3600)) / 60;
		int ss = seconds % 60;
		
		String result = String.format("%02d:%02d:%02d", hh, mm, ss);
		
		return result;
	}
}