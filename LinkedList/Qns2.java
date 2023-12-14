package linkedList;
/*
 * Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.

Input : LL = 1 -> 2 -> 4 -> 5 -> 6	pointer = 2	    value =  3. 
Output : 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * */



public class Qns2 {
	static void insertAfterNode(Node pos,Node node) {
		
		node.nextNode = pos.nextNode;
		pos.nextNode = node;
		
		
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		
		Node pos =new Node(2,new Node(4,new Node(5,new Node(6))));
		head.nextNode = pos;
		Node node = new Node(3);
		insertAfterNode(pos, node);
		Node tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode=tempNode.nextNode;
		}

		
	}

}
