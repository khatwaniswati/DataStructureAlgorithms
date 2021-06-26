package com.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 3, 5, 1 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = { 1,2,3,4,5,6 };
		insertionSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	private static void insertionSort(int[] arr) {
		int count=0;
		for (int i = 1; i < arr.length; i++) {
			int value=arr[i];
			int index=i;
			while(index>0 && arr[index-1]>value) {
				count++;
				arr[index]=arr[index-1];
				index--;
			}
			arr[index] = value;
		}
		System.out.println("InsertionSort Inner Iterations:"+count);
	}

}
