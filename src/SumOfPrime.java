public class SumOfPrime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(sumOfPrime(100));
	}
	
	public static int sumOfPrime(int max) {
		if (max < 2) {
			return -1;
		}
	
		boolean[] arr = new boolean[max+1];
		
		for (int i = 2; i <= Math.sqrt(100); i++) {
			int result = i;
			int m = 2;
			
			while (result < max) {
				System.out.println(result);
				result = i * m;
				arr[result] = true;
				m++;
			} 
		}
	
	int sum = 0;
	
	for (int i = 2; i <= 100; i++) {
		if (arr[i]) {
			sum += i;
		}
	}
	
	return sum;
	} 
}