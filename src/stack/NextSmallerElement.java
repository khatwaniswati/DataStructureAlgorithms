package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		int[] arr = { 3, 10, 5, 1, 15, 10, 7, 6 };
		System.out.println("Array: " + Arrays.toString(arr));
		int[] nextSmaller = nextSmaller(arr);
		System.out.println("nextSmaller: " + Arrays.toString(nextSmaller));
		int[] nextGreater = nextGreater(arr);
		System.out.println("prevGreater: " + Arrays.toString(nextGreater));
	}

	private static int[] nextGreater(int[] arr) {
		int[] nextGreater = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		int j = arr.length-1;
		for (int i=arr.length-1;i>=0;i--) {

			while (!stack.isEmpty() && stack.peek() < arr[i]) {
				stack.pop();
			}

			if (stack.isEmpty())
				nextGreater[j] = -1;
			else {
				nextGreater[j] = stack.peek();
			}
			stack.push(arr[i]);
			j--;
		}
		return nextGreater;
	}

	private static int[] nextSmaller(int[] arr) {
		int[] nextSmaller = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		int j = arr.length-1;
		for (int i=arr.length-1;i>=0;i--) {

			while (!stack.isEmpty() && stack.peek() > arr[i]) {
				stack.pop();
			}

			if (stack.isEmpty())
				nextSmaller[j] = -1;
			else {
				nextSmaller[j] = stack.peek();
			}
			stack.push(arr[i]);
			j--;
		}
		return nextSmaller;
	}

}
