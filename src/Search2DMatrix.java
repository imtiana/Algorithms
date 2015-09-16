
public class Search2DMatrix {

	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] test = new int[][] {
			{1, 3, 5, 7}, 
			{10, 11, 16, 20},
			{23, 30, 34, 50}
		};
		
		int[][] test2 = new int[][] {
			{1}
		};
		
		System.out.println(binarySearchCol(test2, 0));
		
		System.out.println(searchMatrix(test, 51));
		System.out.println(searchMatrix(test2, 1));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int col = binarySearchCol(matrix, target); 
		
		if (col == Integer.MIN_VALUE) {
			return true;
		}
		
		else {
			if (binarySearchRow(matrix, target, col) == -1) {
				return false;
			} 
			else {
				return true;
			}
		}
	}
	
	public static int binarySearchCol(int[][] matrix, int target) {
		int lo = 0;
        int hi = matrix.length - 1;
        
        int mid = 0;
        
        while (lo <= hi) {
        	mid = (hi + lo) / 2; // same as lo + (hi - lo) / 2;
        	
        	System.out.println(matrix[mid][0]);
        	
        	if (matrix[mid][0] == target) {
        		System.out.println("why");
        		return Integer.MIN_VALUE; //has been found
        	}
        	if (matrix[mid][0] > target) {
        		hi = mid - 1;
        	}
        	else if (matrix[mid][0] < target) {
        		lo = mid + 1;
        	}
        }
        
        if (matrix[mid][0] < target) {
        	return mid;
        }
        else {
        	return mid-1;
        }
	}
	
	public static int binarySearchRow(int[][] matrix, int target, int r) {
 
        int lo = 0;
        int hi = matrix[0].length - 1;
        
        while (lo <= hi) {
        	int mid = (hi + lo) / 2; //lo + (hi - lo) / 2;
        	
        	System.out.println(r);
        	
        	if (matrix[r][mid] == target) {
        		return mid;
        	}
        	if (matrix[r][mid] > target) {
        		hi = mid - 1;
        	}
        	else if (matrix[r][mid] < target) {
        		lo = mid + 1;
        	}
        }
        
        return -1;
    }
}
