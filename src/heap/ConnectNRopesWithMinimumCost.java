package heap;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimumCost {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 8, 6, 9 };
		int cost = minCost(arr);
		System.out.println(cost);
	}

	private static int minCost(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int cost = 0;
		while (pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();
			int addedRope = first + second;
			cost += addedRope;
			pq.add(addedRope);
		}
		return cost;
	}

}
