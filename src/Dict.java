import java.util.ArrayList;
import java.util.HashSet;


public class Dict {

	public static HashSet<String> dict = new HashSet<String>();
	
	public static void main(String[] args) {
		dict.add("cat");
		dict.add("aat");
		dict.add("bat");
		dict.add("bet");
		dict.add("bot");
		dict.add("bog");
		dict.add("dog");
		
		wordPath("cat", "aat");
	}

	public static void wordPath (String a, String b) {
		ArrayList<String> words = new ArrayList<String>();
		words.add(a);
		
		_wordPath(b.toCharArray(), a.toCharArray(), words);
	}

	// would it be better to a hashmap of index & words instead of arraylist or words? .contains is O(N)
	public static boolean _wordPath(char[] b, char[] c, ArrayList<String> words) {	
		System.out.println(String.valueOf(c));
		
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] curr = new char[c.length];
		curr = c;
		
		if (curr == b) {
			words.add(b.toString());
			for (String word : words) {
				System.out.println(word);
			}
			return true;
		}
		
		for (int i = 0; i<b.length; i++) {
			for (int j = 0; j<alpha.length; j++) {
				if (curr[i] != alpha[j]) {
					curr[i] = alpha[j];
					if (dict.contains(String.valueOf(curr)) && !words.contains(String.valueOf(curr))) {
						words.add(String.valueOf(curr));
						
						if (_wordPath(b, curr, words)) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
}