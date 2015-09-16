class DoubleParseString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(ParseString("-246.379"));
		System.out.println(ParseString("246.379"));
		System.out.println(ParseString("24"));
		System.out.println(ParseString("0"));
	}
	
	public static double ParseString(String input) {
		if (input == null || input == "") { throw new IllegalArgumentException(); }

		boolean isNeg = false;
	
		if (input.charAt(0) == '-') { 
			isNeg = true;
			input = input.substring(1, input.length());  // assume this works
		}
		
		String first = new String();
		String second = new String(); // init to empty string. but second == "" doesnt work. "".equals() does.
		
		boolean hasDot = false;
		
		for (int i = 0; i<input.length(); i++) {
			if (input.charAt(i) == '.') {
				first = input.substring(0,i);
				second = input.substring(i+1, input.length());
				hasDot = true;
				break;
			}
		}
		
		if (hasDot == false) {
			first = input;
			second = null;
		}
		
		double currNum = 0;
		double currMul = 1;
		
		for (int i = first.length() -1; i >=0; i--) {
			currNum += (first.charAt(i) - '0') * currMul;
			currMul *= 10; 
		} 
	
		if (!second.equals("")) {
			currMul = 0.1;
			for (int i = 0; i<second.length(); i++) {
				currNum += (second.charAt(i) - '0') * currMul;
				currMul *= 0.1;
			}
		}
		
		if (isNeg == true) {
			currNum *= -1;
		}
		
		return currNum;
	}
}
