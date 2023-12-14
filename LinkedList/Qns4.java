package linkedList;
/*
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * */


public class Qns4 {
		static boolean isPalindrome(Node head) {
			// creating deep copy reversed given Linked list
			Node newHead = null;
			Node temp1 = head;
			while(temp1!=null) {
				Node temp2 = new Node(temp1);
				temp2.nextNode = newHead;
				newHead = temp2;
				temp1=temp1.nextNode;
			}
			//comparing both
			//LinkedList.travers(newHead);
			temp1 = head;
			Node temp2 = newHead;
			while(temp1!=null) {
				if(temp1.data!=temp2.data) return false;
				temp1=temp1.nextNode;
				temp2=temp2.nextNode;
			}
			return true;
			
		}
		public static void main(String[] args) {
			Node head = new Node(1, new Node(2,new Node(1,new Node(2,new Node(1)))));
			LinkedList.travers(head);
			System.out.println(isPalindrome(head));

		}

}
