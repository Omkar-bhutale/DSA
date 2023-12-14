package linkedList;



/*Q3. Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.
*/
public class Qns3 {
	  static Node removeDuplicatNodes(Node head) {
		if(head==null) return null;
		while(head.nextNode!=null && head.data==head.nextNode.data) {
			head=head.nextNode;
		}
		Node tempNode = head;
		while(tempNode!=null&&tempNode.nextNode!=null) {
			if(tempNode.data == tempNode.nextNode.data) {
				tempNode.nextNode = tempNode.nextNode.nextNode;
			}else {
				tempNode = tempNode.nextNode;
			}
			
		}
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(1, new Node(1,new Node(2,new Node(2,new Node(3)))));
		head=removeDuplicatNodes(head);
		LinkedList.travers(head);

	}
}
