package arrays;

public class StockBuyAndSell1 {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 8, 7, 2, 5 };
		int profit = maximizeProfit1(arr);
		System.out.println("Profit with T.C. O(n) and Aux Space O(n) : "+profit);
		int profit2 = maximizeProfit2(arr);
		System.out.println("Profit with T.C. O(n) and Aux Space O(1) : "+profit2);
	}

	private static int maximizeProfit1(int[] arr) {
		int[] auxMax = new int[arr.length];
		int max=0;
		for (int i = arr.length-1; i >=0; i--) {
			max=Math.max(max, arr[i]);
			auxMax[i]=max;
		}
		int maxProfit=0;
		for (int i = 0; i < auxMax.length; i++) {
			int diff=auxMax[i]-arr[i];
			maxProfit=Math.max(maxProfit, diff);
		}
		return maxProfit;
	}

	private static int maximizeProfit2(int[] arr) {
		int maxProfit=0;
		int minSoFar=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			minSoFar=Math.min(minSoFar, arr[i]);
			int profit=arr[i]-minSoFar;
			maxProfit=Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

}
