package linkedList;



public class LinkedList {
	Node insert(Node head,int data,int k) {
		Node newnNode = new Node(data);
		if(k==0) {
			newnNode.nextNode = head;
			return newnNode;
		}
		if(head==null) return null;
		Node temp = head;
		for(int i =1;i<k;i++) {
			temp = temp.nextNode;
		}
		newnNode.nextNode = temp.nextNode;
		temp.nextNode = newnNode;
		return head;		
	}
	Node deleteKthNode(Node head,int k) {
		if(head == null) return null;
		if(k==0) return head.nextNode;
		Node temp = head;
		for(int i =1;i<k;i++) {
			if(temp.nextNode==null) {System.out.println("can not delete"); return head;}
			temp=temp.nextNode;
		}
		if(temp.nextNode==null) {System.out.println("can not delete"); return head;}
		temp.nextNode = temp.nextNode.nextNode;
		
		return head;
	}
	Node deleteDataNode(Node head,int data) {
		if(head==null) return null;
		if(head.data==data) return head;
		Node temp = head;
		while(temp.nextNode!=null) {
			if(temp.nextNode.data==data) {
				temp.nextNode= temp.nextNode.nextNode;
				return head;
			}
			temp=temp.nextNode;
		}
		return head;
	}
	Node deleAllMatingDataNodes(Node head,int data) {
//		if(head==null) return null;
		while(head!=null && head.data == data) head=head.nextNode;
		if(head==null) return null;
		Node temp = head;
		while(temp.nextNode!=null) {
			if(temp.nextNode.data==data) {
				temp.nextNode= temp.nextNode.nextNode;
				
			}
			temp=temp.nextNode;
		}
		return head;
		
	}
	
	static void travers(Node Head) {
		Node temp = Head;
		System.out.print("[");
		while(temp!=null) {
			System.out.print(" "+temp.data+" ");
			temp=temp.nextNode;
		}
		System.out.println("]");
	}
	Node reverse(Node head) {
		Node pre = null;
		Node curr = head;
		//Node temp = head.nextNode;
		while(curr!=null) {
			Node temp = curr.nextNode;
			curr.nextNode = pre;
			pre = curr;
			curr = temp;
		}
		head = pre;
		return head;
	}
	public static void main(String[] args) {
		Node n1 = new Node(11);
		Node n2 = new Node(12);
		Node n3 = new Node(13);
		Node n4 = new Node(14);
		Node n5 = new Node(15);
		n1.nextNode = n2;
		n2.nextNode = n3;
		n3.nextNode = n4;
		n4.nextNode = n5;
		n5.nextNode = null;
		LinkedList ll = new LinkedList();
		LinkedList.travers(n1);
		ll.insert(n1, 5, 3);
		LinkedList.travers(n1);
		ll.deleteKthNode(n1, 3);
		LinkedList.travers(n1);
		LinkedList.travers(ll.reverse(n1));
		
		
	}

}
