package heap;

import java.util.ArrayList;
import java.util.List;

public class InsertAndDeleteInHeap {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(50);
		lst.add(30);
		lst.add(40);
		lst.add(10);
		lst.add(5);
		lst.add(20);
		lst.add(30);
		System.out.println(lst);
		insertInHeap(lst, 60);
		System.out.println(lst);
		deleteInHeap(lst);
		System.out.println(lst);
	}

	private static void insertInHeap(List<Integer> lst, int no) {
		int n = lst.size();
		lst.add(no);
		int i = n;
		while (i > 1) {
			int parent = i / 2;
			if (lst.get(parent) < lst.get(i)) {
				swap(lst, parent, i);
				i = parent;
			} else
				return;

		}
	}

	private static void swap(List<Integer> lst, int parent, int i) {
		int temp = lst.get(parent);
		lst.set(parent, lst.get(i));
		lst.set(i, temp);
	}

	private static void deleteInHeap(List<Integer> lst) {
		int n = lst.size();
		int lastNodeValue=lst.get(n-1);
		lst.remove(n-1);
		lst.set(1, lastNodeValue);
		int i = 1;
		while (2*i <= n-2) {
			int left=2*i;
			int large;
			if((2*i+1)<=n-2) {
				int right=2*i+1;
				large=lst.get(left)>lst.get(right)?left:right;
			}else {
				large=left;
			}
			System.out.println(i+" "+large+" "+left);
			if (lst.get(large) > lst.get(i)) {
				swap(lst, large, i);
				i = large;
			} else
				return;

		}
	}

}
