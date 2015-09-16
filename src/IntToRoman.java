
public class IntToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String conv (int n) {
		if ( n<0 || n>399 ) {
			throw new IllegalArgumentException();
		}
		
		String temp ="";
		String s = Integer.toString(n);
		
		int l = s.length();
		int d = l-1;
		
		while (d >= 0) {
			if (d == l-1) {
				temp = convD(s.charAt(d), "IVX") + temp;
			}
			else if ( d == l-2) {
				temp = convD(s.charAt(d), "XLC") + temp;
			}
			else if (d == l-2) {
				temp = convD(s.charAt(d), "CDM") + temp;
			}
			d--;
		}
		
		return temp;
	}
	
	static String convD (char n, String c) {
		if (n == '0') { return ""; }
		
		String d = new String();
		
		switch (n) {
			case '1' : d = "" + c.charAt(0); break;
			case '2' : d = "" + c.charAt(0) + c.charAt(0); break;
			case '3' : d = "" + c.charAt(0) + c.charAt(0) + c.charAt(0); break;
			case '4' : d = "" + c.charAt(0) + c.charAt(1); break;
			case '5' : d = "" + c.charAt(1); break;
			case '6' : d = "" + c.charAt(1) + c.charAt(1); break;
			case '7' : d = "" + c.charAt(1) + c.charAt(0) + c.charAt(0); break;
			case '8' : d = "" + c.charAt(1) + c.charAt(0) + c.charAt(0) + c.charAt(0); break;
			case '9' : d = "" + c.charAt(2) + c.charAt(0); break;
		}
		
		return d;
	}

}
