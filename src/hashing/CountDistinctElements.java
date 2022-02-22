package hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {

	public static void main(String[] args) {
		int ar[] = {5,10,15,5,10,20};
		System.out.println(countDistinct(ar));
	}

	private static int countDistinct(int[] ar) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		return set.size();
	}

}
