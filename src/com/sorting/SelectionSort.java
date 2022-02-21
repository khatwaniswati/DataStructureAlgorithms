package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {4,2,6,3,5,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min=i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] <arr[min])
					min=j;
			}
			if(min!=i)
				swap(arr, i, min);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
