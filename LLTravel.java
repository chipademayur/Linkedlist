//Linked List traverse
package middle;

public class LLTravel {
	static void printLL(Node head) {
		Node cur=head;
		while(cur !=null) {
			System.out.print(cur.data+" -> ");
			cur=cur.next;
		}
		System.out.print("end");
		}

	public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		printLL(head);

	}

}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
