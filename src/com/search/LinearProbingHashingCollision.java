package com.search;

import java.util.Arrays;

public class LinearProbingHashingCollision {

	public static void main(String[] args) {
		int[] arr = {-1,-1,-1,-1};
		insert(arr, 5);
		insert(arr, 7);
		insert(arr, 1);
		insert(arr, 2);
		insert(arr, 2);
		System.out.println(Arrays.toString(arr));
	}

	public static void insert(int[] arr, int n) {
		int hashBucket = hashFunction(arr, n);
		int key=hashBucket;
		while(arr[hashBucket]!=-1) {
			hashBucket=(hashBucket+1)%arr.length; //incrementing hashbucket

			if(arr[hashBucket]==-1)
				break;

			if(key==hashBucket) {
				System.out.println("Array is full, can't insert more elements");
				return;
			}
		}
		arr[hashBucket]=n;
	}

	public static void remove(int[] arr, int n) {
		int hashBucket = hashFunction(arr, n);
		int key=hashBucket;
		if(arr[hashBucket]==n) {
			arr[hashBucket]=-1;
			System.out.println("Element "+n+" removed from "+hashBucket+" index");
			return;
		}
		while(arr[hashBucket]!=-1) {
			hashBucket=(hashBucket+1)%arr.length; //incrementing hashbucket

			if(arr[hashBucket]==n) {
				System.out.println("Element "+n+" removed from "+hashBucket+" index");
				return;
			}

			if(key==hashBucket) {
				System.out.println("As element not found, can't remove elements from array");
				return;
			}
		}
	}

	public static void search(int[] arr, int n) {

	}
	
	public static int hashFunction(int[] arr,int n) {
		return n%arr.length;
	}

}
