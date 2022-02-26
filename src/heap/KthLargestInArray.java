package heap;

import java.util.PriorityQueue;

public class KthLargestInArray {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 60, 30, 50, 40 };
		int k = 3;
		int kth = findKthLargest(arr, k);
		System.out.println(kth);

	}

	private static int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			q.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if(q.peek()<arr[i]) {
				q.poll();
				q.add(arr[i]);
			}
		}
		return q.peek();
	}

}
