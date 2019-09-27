package s202;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class Pangram {
	public static boolean isPangramma(String s) {
		s = s.toLowerCase();
		Set<Character> oneChar = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a') && (ch <= 'z')) {
				oneChar.add(ch);
			}
		}
		
		return oneChar.size() == 26;

	}

}
