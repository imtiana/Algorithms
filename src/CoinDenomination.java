public class CoinDenomination {

	public static void main (String[] args) throws java.lang.Exception
	{
		denomination(70);
	}

	public static void denomination (int amount) {
		if (amount < -1) {
			throw new IllegalArgumentException();
		}
	
		int[] coins = {0, 0, 0, 0};
	
		denom(coins, amount, 25); 
	
		return;
	}
	
	public static void denom(int[] coins, int rem, int current) {
		if (rem == 0) { 
			for (int i = 0; i < coins.length; i++) {
				System.out.print(coins[i]);
				System.out.print(",");
				System.out.println();
			}
		return;
		}
		
		if (current == 1) {
			coins[3] = rem;
		
			for (int i = 0; i < coins.length; i++) {
				System.out.print(coins[i]);
				System.out.print(",");
				System.out.println();
			}
	
			return;
		}
		
		int biggest = rem/current;
		
		if (current == 25) {
			for (int i = biggest; i >= 0; i--) {
				coins[0] = i;
				rem -= current*i;
				denom(coins, rem-current*i, 10);
			}
		}
	
		else if ( current == 10 ) {
			for (int i = biggest; i >= 0; i--) {
				coins[1] = i;
				rem -= current*i;
				denom(coins, rem-current*i, 5);
			}	
		}
		
		else if ( current == 5 ) {
			for (int i = biggest; i >= 0; i--) {
					coins[2] = i;
					rem -= current*i;
					denom(coins, rem-current*i, 1);
				}
		}
		
		return;
	}

}