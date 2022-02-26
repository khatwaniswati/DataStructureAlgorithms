package linkedlist;

public class BuildingLinkedList {

	public static void main(String[] args) {
		Node head=null;
		head = insert(head, 0, 5);
		insert(head, 1, 10);
		insert(head, 2, 15);
		insert(head, 3, 24);
		insert(head, 4, 40);
		traverse(head);
		delete(head, 3);
		traverse(head);
	}

	public static void traverse(Node head) {
		Node cur = head;
		while(cur!=null) {
			System.out.println(cur.getData());
			cur=cur.getNext();
		}
	}

	public static Node insert(Node head, int pos, int data) {
		Node newNode = new Node(data);
		if(pos==0) {
			newNode.setNext(head);
			head=newNode;
			return head;
		}
		Node prev=head;
		for (int i = 0; i < pos-1; i++) {
			prev = prev.getNext();
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return head;
	}
	public static void delete(Node head, int pos) {
		if(pos==0) {
			head=head.getNext();
			return;
		}
		Node prev=head;
		for (int i = 0; i < pos-1; i++) {
			prev=prev.getNext();
		}
		prev.setNext(prev.getNext().getNext());
	}
}
