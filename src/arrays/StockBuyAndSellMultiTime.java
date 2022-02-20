package arrays;

public class StockBuyAndSellMultiTime {

	public static void main(String[] args) {
		int[] arr = {5,2,6,1,4,7,3,6};
		System.out.println(maxProfit(arr));
	}

	private static int maxProfit(int[] arr) {
		int maxProfit=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[i-1])
				maxProfit+=arr[i]-arr[i-1];
		}
		return maxProfit;
	}

}
