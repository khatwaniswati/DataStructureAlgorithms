package com.queue;

import java.util.Arrays;

public class LinearQueueUsingArray {

	private int[] arr = null;
	private int front, rear;

	public LinearQueueUsingArray(int i) {
		arr = new int[i];
		rear = -1;
		front = 0;
	}

	public static void main(String[] args) {
		LinearQueueUsingArray queue = new LinearQueueUsingArray(5);
		System.out.println(queue.isEmpty() + " " + queue.isFull());
		queue.push(10);
		queue.push(20);
		queue.push(30);
		System.out.println("Peeked:" + queue.peek());
		System.out.println("Popped:" + queue.pop());
		queue.push(40);
		queue.push(50);
		System.out.println(queue.isEmpty() + " " + queue.isFull());
		queue.push(60);
		System.out.println("Peeked:" + queue.peek());
		queue.printArray();
	}

	public boolean isEmpty() {
		return front == rear ? true : false;
	}

	public boolean isFull() {
		return rear == arr.length - 1 ? true : false;
	}

	public void push(int i) {
		if (!isFull()) {
			rear++;
			arr[rear] = i;
		} else {
			System.out.println("Array is Full, sorry can't insert more elements!!");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int frontElement = arr[front];
			arr[front] = 0;
			front++;
			return frontElement;
		}
		return -1;
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[front];
		}
		return -1;
	}

	public void printArray() {
		System.out.println(Arrays.toString(arr));
	}
}