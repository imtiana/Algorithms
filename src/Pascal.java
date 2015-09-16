public class Pascal {

	public static void main (String[] args) throws java.lang.Exception
	{
		printPascal(3);
	}
	
	public static void printPascal(int n) {
		if (n<=0) { return; }
		
		if (n == 1) {
			System.out.println("1");
			return;
		}
		
		int[][] t = new int[n][n];
		t[0][0] = 1;
		t[1][0] = 1;
		t[1][1] = 1;		
		
		if (n == 2) {
			printMatrix(t, 2);
			return;
		}
		
		for (int i = 2; i<n; i++) {
			for (int j = 0; j<n; j++) {
				if (j == 0 || j == n) {
					t[n][j] = 1;
				}
				else {
					t[n][j] = t[n-1][j];
				}				
			}
		}
		
		//printMatrix(t);
		
		return;
	}
	
	public static void printMatrix(int[][] t, int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j<t[0].length; j++) {
				if (t[i][j] != 0) {
					System.out.print(t[i][j]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		return;
	}

}
