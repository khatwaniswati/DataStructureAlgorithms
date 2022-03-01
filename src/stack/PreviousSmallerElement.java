package stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		int[] arr = { 4, 10, 5, 8, 20, 15, 3, 12 };
		System.out.println("Array: " + Arrays.toString(arr));
		int[] prevSmaller = prevSmaller(arr);
		System.out.println("prevSmaller: " + Arrays.toString(prevSmaller));
		int[] prevGreater = prevGreater(arr);
		System.out.println("prevGreater: " + Arrays.toString(prevGreater));
	}

	private static int[] prevGreater(int[] arr) {
		int[] prevGreater = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i : arr) {

			while (!stack.isEmpty() && stack.peek() < i) {
				stack.pop();
			}

			if (stack.isEmpty())
				prevGreater[j] = -1;
			else {
				prevGreater[j] = stack.peek();
			}
			stack.push(i);
			j++;
		}
		return prevGreater;
	}

	private static int[] prevSmaller(int[] arr) {
		int[] prevSmaller = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i : arr) {

			while (!stack.isEmpty() && stack.peek() > i) {
				stack.pop();
			}

			if (stack.isEmpty())
				prevSmaller[j] = -1;
			else {
				prevSmaller[j] = stack.peek();
			}
			stack.push(i);
			j++;
		}
		return prevSmaller;
	}

}
