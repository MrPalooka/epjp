package s105ex;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import sun.security.util.Length;


public class ListG {

	public static TreeSet<Character> getMylist(String s) {
		List<Character> list = new ArrayList<>();
		
		for(int i=0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		TreeSet<Character> sortedChar = new TreeSet<>(list);
		return sortedChar;
		
		public static void main(String[] args) {
			System.out.println("Sorted char:" +  achar(s));
		}
	}
	
}
