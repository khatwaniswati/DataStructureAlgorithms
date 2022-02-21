package com.search;

public class SearchInfinite {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 8, 12, 58, 72 };
		int res = searchInfinite(arr, 58);
		System.out.println(res);
	}

	private static int searchInfinite(int[] arr, int key) {
		int low=0;
		int high=1;
		while(arr[high]<key) {
				low=high;
				high=high*2;
		}
		return binarySearch(arr, key,low,high);
	}
	
	public static int binarySearch(int[] arr,int key,int low,int high) {
		while(low<=high) {		//TimeComplexity O(log n)
			int mid = (low+high)/2;
			if(key<arr[mid])
				high=mid-1;
			else if(key>arr[mid])
				low=mid+1;
			else
				return mid;
		}
		return -1;
	}

}
