package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInWindowK {

	public static void main(String[] args) {
		int ar[] = {1,2,2,1,3,1,1,3};
		int k=4;
		countDistinctInWindowK(ar,k);
	}

	private static void countDistinctInWindowK(int[] ar, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
		}
		System.out.println(map.size());
		for (int i = k; i < ar.length; i++) {
			if(map.get(ar[i-k])==1)
					map.remove(ar[i-k]);
			else
				map.put(ar[i-k], map.get(ar[i-k])-1);
			map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
			System.out.println(map.size());
		}
	}

}
