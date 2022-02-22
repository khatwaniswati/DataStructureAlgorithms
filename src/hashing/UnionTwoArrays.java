package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 5, 10, 15, 5, 10, 20 };
		int arr2[] = { 5, 10, 100 };
		int arr[] = union(arr1, arr2);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] union(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		int[] arr = new int[set.size()];
		int i=0;
		for (Integer integer : set) {
			arr[i]=integer;
			i++;
		}
		return arr;
	}

}
