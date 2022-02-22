package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 5, 10, 15, 5, 10, 20 };
		int arr2[] = { 5, 10, 100 };
		int arr[] = intersection(arr1, arr2);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] intersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		int k=0;
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		int[] arr = new int[set.size()];
		for (int i = 0; i < arr2.length; i++) {
			if(set.contains(arr2[i])) {
				arr[k]=arr2[i];
				k++;
				set.remove(arr2[i]);
			}
		}
		return arr;

	}

}
