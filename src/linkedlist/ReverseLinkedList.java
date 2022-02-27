package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = null;
		head = BuildingLinkedList.insert(head, 0, 1);
		BuildingLinkedList.insert(head, 1, 4);
		BuildingLinkedList.insert(head, 2, 7);
		BuildingLinkedList.traverse(head);
		/*
		 * head = reverse(head); System.out.println("Reversed:");
		 * BuildingLinkedList.traverse(head);
		 */
		head=reverseUsingRecursion(head);
		System.out.println("Reversed:");
		BuildingLinkedList.traverse(head);
	}

	public static Node  reverse(Node head) {
		Node prev=null;
		Node cur=head;
		while (cur!=null) {
			Node temp=cur.getNext();
			cur.setNext(prev);
			prev=cur;
			cur=temp;
		}
		return prev;
	}

	private static Node  reverseUsingRecursion(Node head) {
		if(head==null || head.getNext()==null)
			return head;
		
		Node newHead=reverseUsingRecursion(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return newHead;
	}
}
