package stack;

import linkedlist.Node;

public class StackUsingLinkedList {

	private Node head;
	private int size;
	
	public StackUsingLinkedList() {
		head=null;
		size=0;
	}
	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public void push(int ele) throws Exception {
		Node newNode=new Node(ele);
		newNode.setNext(head);
		head=newNode;
		size++;
	}

	public int peek() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is Empty");

		return head.getData();
	}

	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is Empty");

		int res = head.getData();
		head=head.getNext();
		size--;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
