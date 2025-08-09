 class LinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
    }
    public void addfirst(int data) {
    	Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addmid(int data,int index) {
    	Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++) {
        	current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public void removelast() {
        if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
        Node current=head;
        while(current.next.next!=null) current=current.next;
        current.next=null;
    }
    public void removefirst() {
    	if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
    	Node current=head;
        head=head.next;
        current=null;
    }
    public void removemid(int index) {
    	if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
    	Node current=head;
    	for(int i=0;i<index-1;i++) {
    		current=current.next;
    	}
    	current.next=current.next.next;
    }
    public void addlast(int data) {
    	add(data);
    }
    public void display() {
    	Node current=head;
    	while(current!=null) {
    		System.out.print(current.data+" ");
    		current=current.next;
    	}
    	
    }
}
class LinkedListEg {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.addfirst(5);
		list.addlast(50);
		list.removemid(2);
		list.addmid(35,3);
		list.display();
	}

}