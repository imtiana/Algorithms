import java.util.HashMap;


public class RomanToDecimal {

	public static void main(String[] args) {
		System.out.println(RomanToInt("XIV"));
	}

	static int RomanToInt (String s) {
		if (s == null || s == "") { throw new IllegalArgumentException(); }
	
		int sum = 0;
		int curr = 0;
		int right = 1001;

		for (int i = s.length() -1 ; i>=0; i++) {
			switch (s.charAt(i)) {
				case 'I' : curr = 1; break;
				case 'V' : curr = 5; break;
				case 'X' : curr = 10; break;
				case 'L' : curr = 50; break;
				case 'C' : curr = 100; break;
				case 'D' : curr = 500; break;
				case 'M' : curr = 1000; break;		
			}
			
			if (curr>=right) {
				sum += curr;
			}
			else {
				sum -= curr;
			}
			
			right = curr;
		}

		return sum; 
	}

}
