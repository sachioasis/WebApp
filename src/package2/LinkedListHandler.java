package package2;

public class LinkedListHandler {
	
	void appendToTail(Node head, Node end) {
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
		
	Node deleteNode(Node head, String name) {
		if (head.name == name) {
			return head.next;
		}
		
		Node n = head;
		while (n.next != null) {
			if (n.next.name == name) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}
