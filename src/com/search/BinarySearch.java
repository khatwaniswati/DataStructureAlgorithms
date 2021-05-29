package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,9,5,6,7,8};
		System.out.println(binarySearch(arr, 10));
	}
	
	public static int binarySearch(int[] arr,int n) {
		int low=0, high=arr.length-1;
		while(low<=high) {		//TimeComplexity O(log n)
			int mid = (low+high)/2;
			if(n<arr[mid])
				high=mid-1;
			else if(n>arr[mid])
				low=mid+1;
			else
				return mid;
		}
		return -1;
	}

}
