class LinkedList {
	private Node head;
	private class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public void add (int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	public void removeLast() {
		Node current=head;
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
	}
	public void removeFirst() {
		Node current=head;
		head=head.next;
		current=null;
	}
public void addLast(int data) {
	add(data);
}
public void display() {
	Node current=head;
	while(current!=null) {
		System.out.println(current.data+" ");
		current=current.next;
	}
	System.out.println();
}
}
class LinkedListExample{
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.removeLast();
		list.add(4);
		list.add(5);
		list.removeLast();
		list.add(7);
		list.removeFirst();
		list.display();
	}

}
