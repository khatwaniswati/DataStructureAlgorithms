package stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaInHistogram {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };

		int maxArea = maxArea(arr);
		System.out.println("MaxArea:" + maxArea);
	}

	private static int maxArea(int[] arr) {
		int maxArea = 0;
		int[] prevSmaller = prevSmaller(arr);
		int[] nextSmaller = nextSmaller(arr);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(prevSmaller));
		System.out.println(Arrays.toString(nextSmaller));

		for (int i = 0; i < arr.length; i++) {
			int curArea = (nextSmaller[i] - prevSmaller[i] - 1) * arr[i];
			maxArea = Math.max(maxArea, curArea);
		}
		return maxArea;
	}

	private static int[] prevSmaller(int[] arr) {
		int[] prevSmaller = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
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

	private static int[] nextSmaller(int[] arr) {
		int[] nextSmaller = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		int j = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}

			if (stack.isEmpty())
				nextSmaller[j] = arr.length;
			else {
				nextSmaller[j] = stack.peek();
			}
			stack.push(i);
			j--;
		}
		return nextSmaller;
	}

}
