/*
 import java.util.LinkedList;
 import java.util.HashSet;

public class Museum {

	public static void main(String[] args) {

		String[][] input = new String[4][5];
		
		input[0][0] = ".";
		input[0][1] = "#";
		input[0][2] = ".";
		input[0][3] = ".";
		input[0][4] = ".";
		
		input[1][0] = ".";
		input[1][1] = ".";
		input[1][2] = "#";
		input[1][3] = ".";
		input[1][4] = ".";
		
		input[2][0] = "G";
		input[2][1] = ".";
		input[2][2] = ".";
		input[2][3] = ".";
		input[2][4] = ".";
		
		input[3][0] = ".";
		input[3][1] = ".";
		input[3][2] = "#";
		input[3][3] = ".";
		input[3][4] = ".";
		
		printInput(input);
		System.out.println();
		
		getDistanceMatrix(input);
		printInput(input);

	}

	public static void printInput(String[][] input){
		for(int row = 0; row < input.length; row++){
			for(int col = 0; col < input[0].length; col++){
				System.out.print(input[row][col]);
				if(col == input[0].length-1){
					System.out.print("\n");
				}
			}
		}
	}

	void BFS(String[][] m, int x, int y) {
		LinkedList<Pair<Pair<Integer,Integer>,Integer>> q = new LinkedList<Pair<Pair<Integer,Integer>,Integer>>();
		
		HashSet<Pair<Integer,Integer>> visited = new HashSet<Pair<Integer,Integer>>();

		q.add(new Pair(Pair(x,y),0));
			visited.add(new Pair(x,y));

			while (!q.isEmpty()) {
				Pair<Pair<Integer, Integer>,Integer> curr = q.remove();
		int currX = curr.getLeft().getLeft(); 
				int currY = curr.getLeft().getRight();
				String currD = Integer.toString(curr.getRight());
				String nextD = Integer.toString(curr.getRight()+1);		

				// right
				if (currX + 1 < m.length && m[currX+1][currY] != "G" && m[currX+1][currY] != "#") {
					m[currX+1][currY] = nextD;
					if (!visited.contains(new Pair(currX+1,currY))) {
						q.add(new Pair((currX+1,currY),nextD));
			}
			}

				// top
				if (currY- 1 >=0 && m[currX][currY-1] != "G" && m[currX][currY-1] != "#") {
					m[currX][currY-1] = nextD;
					q.add(new (Pair<currX,currY-1>,nextD));

				// left
				if (currX -1 >= 0 && m[currX-1] != "G" && m[currX-1] != "#") {
					m[currX-1][currY] = nextD;
					q.add(<Pair<currX-1,currY>,nextD>);

				// bottom
				if (currY+ 1 < m[0].length && m[currX][currY+1] != "G" && m[currX][currY+1] != "#") {
					m[currX][currY+1] = nextD;
		q.add(<Pair<currX,currY+1>,nextD>);
			}
			
		}

	java.util.List<java.util.Map.Entry<String,Integer>> pairList= new java.util.ArrayList<>();

	public static void getDistanceMatrix(String[][] input){
		for(int row = 0; row < input.length; row++){
			for(int col = 0; col < input[0].length; col++){
				if(input[row][col].equals(".")){
					input[row][col] = getDistance(input, row, col);
				}
			}
		}
	}
	
	public static String getDistance(String[][] input, int row, int col){
		int MAX = Integer.MAX_VALUE;
		int rowDistance = MAX; 
		int r = row; 
		//previous row
		while(r > 0){
			r--;
			if(input[r][col].equals("G")){
				rowDistance = 1;
				break;
			}
			try{
				rowDistance = Integer.parseInt(input[r][col])+1;
				break;
			}catch(Exception e){
				
			}
		}
		
		int guardIdx = -1; 
		int obstacleNum = 0; 
		// next row
		for(r = row+1; r < input.length; r++){
			if(input[r][col].equals("G")){
				guardIdx = r; 
				break;
			}
			if(input[r][col].equals("#")){
				obstacleNum++;
			}
		}
		if(guardIdx > 0){
			rowDistance = Math.min(rowDistance, guardIdx-row-obstacleNum);
		}
		
		int colDistance = MAX; 
		int c = col; 
		//previous col
		while(c > 0){
			c--;
			if(input[row][c].equals("G")){
				rowDistance = 1;
				break;
			}
			try{
				colDistance = Integer.parseInt(input[row][c])+1;
				break;
			}catch(Exception e){
				
			}
		}
		
		guardIdx = -1; 
		obstacleNum = 0; 
		//next Col
		for(c = col+1; c < input[0].length; c++){
			if(input[row][c].equals("G")){
				guardIdx = c; 
				break;
			}
			if(input[row][c].equals("#")){
				obstacleNum++; 
			}
		}
		
		if(guardIdx > 0){
			colDistance = Math.min(colDistance, guardIdx-col-obstacleNum);
		}
		
		int distance = Math.min(rowDistance, colDistance);
		return String.valueOf(distance);
	}
}
*/

