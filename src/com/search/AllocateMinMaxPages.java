package com.search;

public class AllocateMinMaxPages {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 20 };
		int res = minPages(arr, 2);
		System.out.println(res);

	}

	private static int minPages(int[] arr, int k) {
		int l = maxOf(arr);
		int h = sumOf(arr);
		int res = 0;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (isFeasible(arr, k, mid)) {
				res = mid;
				h = mid - 1;
			} else
				l = mid + 1;
		}
		return res;
	}

	private static int sumOf(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	private static int maxOf(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	private static boolean isFeasible(int[] arr, int k, int res) {
		int student=1;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(sum+arr[i]>res) {
				student++;
				sum=arr[i];
			}else
				sum+=arr[i];
		}
		return student<=k;//doubt
	}
}
