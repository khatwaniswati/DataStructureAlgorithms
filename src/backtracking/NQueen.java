package backtracking;

import java.util.*;

class NQueen {
	static int N = 4;

	public static void main(String[] args) {
		solveNQ();
	}

	/*
	 * This function solves the N Queen problem using Backtracking. It mainly uses
	 * solveNQUtil() to solve the problem. It returns false if queens cannot be
	 * placed, otherwise, return true and prints placement of queens in the form of
	 * 1s. Please note that there may be more than one solutions, this function
	 * prints one of the feasible solutions.
	 */
	static boolean solveNQ() {
		int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		if (solveNQUtil(board, 0) == false) {
			System.out.printf("Solution does not exist");
			return false;
		}

		printSolution(board);
		return true;
	}

	/* A utility function to print solution */
	static void printSolution(int board[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.printf(" %d ", board[i][j]);
			System.out.printf("\n");
		}
	}

	/*
	 * A recursive utility function to solve N Queen problem
	 */
	static boolean solveNQUtil(int board[][], int row) {
		if(row==N)
			return true;
		
		for (int i = 0; i < N; i++) {
			if(isSafe(board, row,i)) {
				board[row][i]=1;
				if(solveNQUtil(board, row+1))
					return true;
				board[row][i]=0;
			}
		}
		return false;
	}

	static boolean isSafe(int board[][], int row, int col) {
		for (int i = 0; i < N; i++) {
			if(board[row][i]==1)
				return false;
		}
		for (int i = 0; i < N; i++) {
			if(board[i][col]==1)
				return false;
		}
		for (int i = row,j=col; i < N && j<N ; i++,j++) {
			if(board[i][j]==1)
				return false;
		}
		for (int i = row,j=col; i>=0 && j>=0 ; i--,j--) {
			if(board[i][j]==1)
				return false;
		}
		for (int i = row,j=col; i>=0 && j<N ; i--,j++) {
			if(board[i][j]==1)
				return false;
		}
		for (int i = row,j=col; i<N && j>=0 ; i++,j--) {
			if(board[i][j]==1)
				return false;
		}
		return true;
	}

}
