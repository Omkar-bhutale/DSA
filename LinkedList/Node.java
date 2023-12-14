package linkedList;

public class Node {
	public Node(Node node) {
		this.data = node.data;
		this.nextNode = node.nextNode;
		
	}
	public Node(int data,Node nextNode) {
		this.data = data;
		this.nextNode =nextNode;
	}
	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
	public Node() {
		
	}
	int data =0;
	Node nextNode = null;

}
