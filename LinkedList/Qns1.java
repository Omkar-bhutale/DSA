package linkedList;
/*Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples: 
input=14->21->11->30->10, X = 14
otput-->Yes
Explanation: 14 is present in the linked list.
/*/
public class Quns1 {
	static boolean isExist(Node head,int x) {
		Node temp =head;
		while(temp!=null) {
			
			if(temp.data==x) return true;
			temp=temp.nextNode;
		}
		return false;
	}
	public static void main(String[] args) {
		Node head = new Node(14, new Node(21,new Node(11,new Node(30,new Node(10)))));
		if(isExist(head, 14)) System.out.println("yes");
	}
}
