package com.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int i, int j) {
		if (i < j) {
			int mid = (i + j) / 2;
			mergeSort(arr, i, mid);
			mergeSort(arr, mid+1, j);
			merge(arr, i, mid, j);
		}
	}

	private static void merge(int[] arr, int l, int mid, int h) {
		int[] result = new int[arr.length];
		int k = l;
		int i = l, j = mid+1;
		while(i <= mid && j <= h) {
			if (arr[i] < arr[j]) {
				result[k] = arr[i];
				i++;
			} else {
				result[k] = arr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			result[k] = arr[i];
			i++;
			k++;
		}
		while (j <= h) {
			result[k] = arr[j];
			j++;
			k++;
		}
		for (int j2 = l; j2 <= h; j2++) {
			arr[j2]=result[j2];
		}
	}

}
