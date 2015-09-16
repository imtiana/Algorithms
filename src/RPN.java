import java.util.EmptyStackException;
import java.util.Stack;

public class RPN {

	public static void main(String[] args) {

		String[] token = { "4", "1", "+", "2.5", "*" } ;
		System.out.println(RPN(token));
		
		String[] token2 = { "5", "80", "40", "/", "+" } ;
		System.out.println(RPN(token2));
		
		String[] IllegalToken = { "4", "+" } ;
		//System.out.println(RPN(IllegalToken));
	
		String[] divideBy0Token = { "4", "0", "/" } ;
		//System.out.println(RPN(divideBy0Token));
		
		String[] IllegalArgumentToken2 = { "4", "0", "$" } ;
		System.out.println(RPN(IllegalArgumentToken2));
		
	}
	
	static double RPN (String[] tok) {
		if (tok == null || tok.length == 0) {
			throw new IllegalArgumentException();
		}
		
		String op = "+-/*";
		Stack<Double> s = new Stack<Double>();
		
		for (String t : tok) {
		
			if (!op.contains(t)) {
				try {
					s.push(Double.parseDouble(t));
				}
				catch (NumberFormatException nfe ){
					throw new IllegalArgumentException();
				}
			}
			else {
				double first;
				double second; 
				
				try {
					first = s.pop();
					second = s.pop();					
				}
				catch (EmptyStackException e) {
					throw new IllegalArgumentException();
				}
				
				switch(t) {
					case "+" :	{
						s.push(first + second);
						break;
					}
					case "-" :	{
						s.push(second - first);
						break;
					}	
					case "*" :	{
						s.push(second * first);
						break;
					}
					case "/" :	{
						if (first == 0) {
							throw new ArithmeticException();
						}
						s.push(second/first);
						break;
					}
					default : {
						throw new IllegalArgumentException();
					}
				}
			}
		}
		return s.pop();
	}

}
