package linkedlist;

public class Node {

	private int data;
	private Node next;
	private Node random;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	

	public Node getRandom() {
		return random;
	}

	public void setRandom(Node random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", random=" + random + "]";
	}

}
