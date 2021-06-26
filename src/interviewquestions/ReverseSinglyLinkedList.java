package interviewquestions;

class SinglyList {
	// Node is static member class of List
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	// head is address of first node of the list.
	private Node head;

	public SinglyList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(int val) { // O(n)
		// create and init new node
		Node newNode = new Node(val);
		// if list is empty, make this node as first node
		if (isEmpty())
			head = newNode;
		else {
			// traverse till last node
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			// last node's next to newnode
			trav.next = newNode;
		}
	}

	public void display() { // O(n)
		System.out.print("List: ");
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}

	public void revDisplay(Node cur) {
		if (cur == null)
			return;
		revDisplay(cur.next);
		System.out.print(cur.data + ", ");
	}

	public void revDisplay() {
		System.out.print("Rev: ");
		revDisplay(head);
		System.out.println();
	}

}

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		SinglyList l = new SinglyList();
		l.addLast(3);
		l.addLast(1);
		l.addLast(5);
		l.addLast(6);
		l.addLast(2);
		l.addLast(7);
		l.addLast(4);
		l.display();

		l.revDisplay();
	}
}
