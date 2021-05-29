package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,9,5,6,7,8};
		System.out.println(linearSearch(arr, 2));
	}
	
	public static int linearSearch(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {		//TimeComplexity O(n)
			if(n==arr[i])
				return i;
		}
		return -1;
	}

}
