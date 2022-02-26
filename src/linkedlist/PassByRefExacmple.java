package linkedlist;

public class PassByRefExacmple {

	public static void main(String[] args) {
		Node head = new Node(1);
		System.out.println(head);
		passByRef(head);
		System.out.println(head);

	}

	private static void passByRef(Node head) {
		head = new Node(20);

	}

}
