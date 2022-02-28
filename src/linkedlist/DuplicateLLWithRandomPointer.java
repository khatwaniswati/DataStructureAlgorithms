package linkedlist;

public class DuplicateLLWithRandomPointer {

	public static void main(String[] args) {
		Node head = null;
		head = BuildingLinkedList.insert(head, 0, 1);
		BuildingLinkedList.insert(head, 1, 2);
		BuildingLinkedList.insert(head, 2, 3);
		BuildingLinkedList.insert(head, 3, 4);
		head.setRandom(head.getNext().getNext());
		head.getNext().setRandom(head);
		head.getNext().getNext().setRandom(head.getNext());
		head.getNext().getNext().getNext().setRandom(head.getNext().getNext());
		BuildingLinkedList.traverse(head);

		System.out.println("Duplicate List");
		Node duplicateLst = duplicateLL(head);
		BuildingLinkedList.traverse(duplicateLst);

	}

	private static Node duplicateLL(Node head) {
		// inserting new nodes in between
		Node cur = head;
		while (cur != null) {
			Node temp = cur.getNext();
			Node newNode = new Node(cur.getData());
			cur.setNext(newNode);
			newNode.setNext(temp);
			cur = temp;
		}

		// setting random pointers of new nodes
		cur = head;
		while (cur != null && cur.getNext() != null) {
			cur.getNext().setRandom(cur.getRandom().getNext());
			cur = cur.getNext().getNext();
		}

		// seperating both the LL
		Node original = head;
		Node copy = head.getNext();
		Node duplicateHead = copy;

		while (copy != null && copy.getNext() != null) {
			original.setNext(original.getNext().getNext());
			copy.setNext(copy.getNext().getNext());
			original = original.getNext();
			copy = copy.getNext();
		}
		return duplicateHead;
	}

}
