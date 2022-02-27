package linkedlist;

public class PalindromeLL {

	public static void main(String[] args) {
		Node head = null;
		head = BuildingLinkedList.insert(head, 0, 1);
		BuildingLinkedList.insert(head, 1, 4);
		BuildingLinkedList.insert(head, 2, 7);
		BuildingLinkedList.insert(head, 3, 7);
		BuildingLinkedList.insert(head, 4, 4);
		BuildingLinkedList.insert(head, 5, 1);
		BuildingLinkedList.traverse(head);
		System.out.println("Is palindrome:"+palindrome(head));
	}

	public static boolean palindrome(Node head) {
		if(head==null || head.getNext()==null)
			return true;
		
		Node mid=middle(head);
		Node last=ReverseLinkedList.reverse(mid.getNext());//Imp NOTE::pass mid next ......
		Node cur=head;
		while (cur!=null && last!=null) {
			if(cur.getData()!=last.getData())
				return false;
			cur=cur.getNext();
			last=last.getNext();
		}
		return true;
	}

	public static Node middle(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.getNext()!=null) {
			fast=fast.getNext().getNext();
			slow=slow.getNext();
		}
		return slow;
	}
}
