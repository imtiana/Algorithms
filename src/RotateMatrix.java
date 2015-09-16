
public class RotateMatrix {

	public static void main(String[] args) {
		int[][] test = {{11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}};
		//rotateM(test);
		
		int[][] test2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		rotateM(test2);
	}
	
	public static void rotateM (int[][] m) {
		if (m == null || m.length <= 1) {
			return;
		}

		int layer = m.length/2;
		
		int min = 0;
		int max = m.length - 1;
		
		int temp = 0;
		
		while (min < max) {
			for (int offset = 0; offset<max; offset++) {		
//				printMatrix(m);
				System.out.println(min);
				System.out.println(max);
				System.out.println(offset);
				System.out.println();
				
				// left top -> temp
				temp = m[min][offset];
				System.out.println(temp);
				
				// left bottom -> left top, y decrease
				m[min][offset] = m[max-offset][min];
				
				printMatrix(m);
				
				// right bottom -> left bottom, x decrease
				m[max-offset][min] = m[max][max-offset];
				printMatrix(m);
				
				// right top -> right bottom, y increase
				m[max][max-offset] = m[offset][max];
				printMatrix(m);
				
				// temp -> right top,
				m[offset][max] = temp;
				printMatrix(m);
			}
			min++;
			max--;
		}
 	}
	
	public static void printMatrix (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
