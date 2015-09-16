
public class totalIsPossible {

	public static void main(String[] args) {

		int[] points = { 3, 7 };
		isScorePossible(points, 10);
		isScorePossible(points, 9);
		isScorePossible(points, 4);	
	}
	
	public static boolean isScorePossible(int[] points, int n) {
		return poss(points, n, 0);
	}
	
	public static boolean poss(int[] points, int n, int sum) {
		if (sum>n) { return false; }
		if (sum == n) { return true; }
		
		for (int i = 0; i<points.length; i++) {
			poss(points, n, sum);
			poss(points, n, sum+points[i]);
		}
		
		return false;
	}

}
