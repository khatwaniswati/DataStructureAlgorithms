package linkedlist;

public class DetectCycleInLL {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		head.setNext(second);
		Node third = new Node(3);
		second.setNext(third);
		Node fourth = new Node(4);
		third.setNext(fourth);
		Node fifth = new Node(5);
		fourth.setNext(fifth);
		Node sixth = new Node(6);
		fifth.setNext(sixth);
		sixth.setNext(third);

		Node first = detectCycleFirstNodeAndRemoveCycle(head);
		System.out.println("Cycle start Node:" + first.getData());
		System.out.println("LL after removing cycle:");
		BuildingLinkedList.traverse(head);

	}

	private static Node detectCycleFirstNodeAndRemoveCycle(Node head) {
		Node meet = detectCycle(head);
		System.out.println("Meeting point:"+meet.getData());
		Node start = head;
		Node prev=null;
		while (meet != start) {
			start = start.getNext();
			prev=meet;
			meet = meet.getNext();
		}
		prev.setNext(null);
		return start;
	}

	private static Node detectCycle(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if (fast.getData() == slow.getData()) {
				return slow;
			}
		}
		return null;
	}

}
