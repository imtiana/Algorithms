import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxUniqueSubstringLength {

	public static void main(String[] args) {
		System.out.println(maxUniqueSubstringLength("aacacsdfeeefsss"));
	}
	
	public static int maxUniqueSubstringLength (String s) {
		if ( s.length() == 0 ) { return 0; } 
	
		int i = 0;
		int j = 1;
	
		int max = 1;
		int currLength = 1;
	
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
		hm.put(s.charAt(i), 0);
		
		while (j < s.length()) {
			if (!hm.containsKey(s.charAt(j))) {
				hm.put(s.charAt(j), j);
				j++;
				currLength++;
			}
			else {
				i = hm.get(s.charAt(j)) + 1;
				j = i + 1;
				hm.clear();
				hm.put(s.charAt(i), i);
				currLength = 1;
			}
			if (currLength>max) {
				max = currLength;
			}
		}
	
	return max;
	}

}
