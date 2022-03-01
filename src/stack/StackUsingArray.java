package stack;

public class StackUsingArray {

	private int capacity;
	private int top;
	private int[] arr;

	public StackUsingArray(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public int size() {
		return top+1;
	}

	public void push(int ele) throws Exception {
		if (isFull())
			throw new Exception("Stack is full...");

		top++;
		arr[top] = ele;
	}

	public int peek() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is Empty");

		return arr[top];
	}

	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is Empty");

		int res = arr[top];
		top--;
		return res;
	}

	public static void main(String[] args) {

	}

}
