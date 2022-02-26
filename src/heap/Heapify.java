package heap;

import java.util.ArrayList;
import java.util.List;

public class Heapify {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(10);
		lst.add(30);
		lst.add(50);
		lst.add(20);
		lst.add(35);
		lst.add(15);
		System.out.println(lst);
		buildHeap(lst);
		System.out.println(lst);
	}

	private static void buildHeap(List<Integer> lst) {
		int n = lst.size();
		for (int i = n / 2; i > 0; --i) {
			heapify(lst, n, i);
		}
	}

	private static void heapify(List<Integer> lst, int n, int i) {
		int largest = i;
		int left = 2 * i;
		int right = 2 * i + 1;
		if (left < n && lst.get(left) > lst.get(largest))
			largest = left;
		if (right < n && lst.get(right) > lst.get(largest))
			largest = right;

		if (largest != i) {
			swap(lst, largest, i);
			heapify(lst, n, largest);
		}

	}

	private static void swap(List<Integer> lst, int j, int i) {
		int temp = lst.get(j);
		lst.set(j, lst.get(i));
		lst.set(i, temp);
	}

}
