package com.search;

public class SortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 120, 130, 40, 50, 90, 100, 110 };
		int res = binarySearch(arr, 140);
		System.out.println(res);
	}

	private static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[low] < arr[mid]) {
				// left part is sorted
				if (key >= arr[low] && key < arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			} else {
				// right part is sorted
				if (key >= arr[mid + 1] && key < arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
	}

}
