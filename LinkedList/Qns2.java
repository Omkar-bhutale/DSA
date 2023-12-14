package linkedList;
/*
 * Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.

Input : LL = 1 -> 2 -> 4 -> 5 -> 6	pointer = 2	    value =  3. 
Output : 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * */



public class Qns2 {
static void push_at(Node head ,int newElement, int position) {     
    Node newNode = new Node(); 
    newNode.data = newElement;
    newNode.next = null;

    if(position < 1) {
      System.out.print("\nposition should be >= 1.");
    } else if (position == 1) {
      newNode.next = head;
      head = newNode;
    } else {
      
      Node temp = new Node();
      temp = head;
      for(int i = 1; i < position-1; i++) {
        if(temp != null) {
          temp = temp.next;
        }
      }
   
      if(temp != null) {
        newNode.next = temp.next;
        temp.next = newNode;  
      } else {
        System.out.print("\nThe previous node is null.");
      }       
    }
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
