package s203;

public class Humming {
	public static int distance(String t, String s) {
		int distance = 0;

		if (t.length() != s.length()) {
			throw new IllegalArgumentException("Le stringe non sono di ugual lunghezza");
		}

		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != t.charAt(i)) {
					distance++;
				}
			}
		}

		return distance;
	}
}
