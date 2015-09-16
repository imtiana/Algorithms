
public class SelfExcludingProduct {

	public static void main(String[] args) {
		int[] test = {3, 1, 4, 2}; 
		System.out.println(selfExcludingProduct(test)); 
	}

	public static int[] selfExcludingProduct (int[] input) {
		if (input == null || input.length <2) {
			throw new IllegalArgumentException();
		}
		
		int[] left = new int[input.length];
		int[] right = new int[input.length];
		
		left[0] = 1;
		right[input.length-1] = 1;
		
		for (int i=1; i<input.length; i++) {
			left[i] = left[i-1] * input[i-1];
		}

		
		for (int i : left) {
			System.out.println(i);
		}
		
		for (int i = input.length-2; i>=0; i--) {
			right[i] = right[i+1] * input[i+1];
		}
		
		for (int i : right) {
			System.out.println(i);
		}
		
		for (int i=0; i<input.length; i++) {
			input[i] = left[i] * right[i];
		}
		
		return input;
	}
}
