package package2;

public class MainTest {

	public static void main(String[] args) {
		
		// algorithm to produce a linked list of 100 nodes
		Node head = new Node();
		head.name = "node1";
		Node currentNode = head;
		for (int i = 2; i <= 100; i++) {
			Node n = new Node();
			n.name = "node" + i;
			currentNode.next = n;
			currentNode = currentNode.next;
		}
		
		// algorithm to take a node with 'node10'
		Node node = head;
		while (node.next != null){
			if (node.next.name.equals("node10")) {
				node.next = node.next.next;
				break;
			}
			node = node.next;
		}
		
		// procedure to show the name of all nodes
//		System.out.println("Before:");
		Node n = head; // initialize
		while (n != null) {
			System.out.println(n.name);
			n = n.next;
		}

		Node n1 = new Node();
		n1.name = "Kiyoshi";
		
		Node n2 = new Node();
		n2.name = "Sachiko";
		n1.next = n2;
		
		Node n3 = new Node();
		n3.name = "John";
		n2.next = n3;
		
		Node n4 = new Node();
		n4.name = "Alice";
		n3.next = n4;
		
		//n3.next = n1;
		//LinkedListHandler listHandler = new LinkedListHandler();
		
//		Node now = n1;
//		while (now.next != null) {
//			now = now.next;
//		}
//		now.next = n4;
//		
//		System.out.println("\nAfter:");
//		n = n1;
//		while (n != null) {
//			System.out.println(n.name);
//			n = n.next;
//		}

	}

}
