package stack;

public class LargestAreaSubmatrixWithAll1s {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 1, 1, 0 }, 
							{ 1, 1, 1, 1, 0, 1 },
							{ 1, 1, 0, 1, 1, 1 },
							{ 1, 1, 1, 1, 1, 0 } };
		int largestArea = largestSubmatrixWith1s(matrix);
		System.out.println("largestArea:" + largestArea);
	}

	private static int largestSubmatrixWith1s(int[][] matrix) {
		int[] curRow=matrix[0];
		int curArea=MaxAreaInHistogram.maxArea(curRow);
		int maxArea=curArea;
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]==1)
					curRow[j]+=1;
				else
					curRow[j]=0;
			}
			curArea=MaxAreaInHistogram.maxArea(curRow);
			maxArea=Math.max(maxArea, curArea);
		}
		return maxArea;
	}

}
