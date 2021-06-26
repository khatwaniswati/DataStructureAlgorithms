package com.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 3, 5, 1 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = { 4, 2, 6, 3, 5, 1 };
		bubbleSortImproved(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {1,2,3,4,5,6};
		bubbleSort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {1,2,3,4,5,6};
		bubbleSortImproved(arr3);
		System.out.println(Arrays.toString(arr3));
	}

	private static void bubbleSortImproved(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					flag = true;
				}
			}
			if (!flag)
				break;
		}
		System.out.println("bubbleSortImproved Iterations:" + count);
	}

	private static void bubbleSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
			}
		}
		System.out.println("bubbleSort Iterations:" + count);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
