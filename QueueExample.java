class Queue {
	private int[] queue;
	private int front,rear,maxSize;
	public Queue(int size) {
		maxSize=size;
		queue=new int[maxSize];
		front=-1;
		rear=-1;
	}
	public boolean isEmpty() {
		return front==-1||front>rear;
	}
	public boolean isFull() {
		return rear==maxSize-1;
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue if full");
			return;
		}
		if(front==-1) {
			front=0;
		}
		queue[++rear]=data;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue");
			return -1;
		}
		int value=queue[front];
		if(front==rear) {
			front=-1;
			rear=-1;
		}else {
			front++;
		}
		return value;
	}
	public int poll() {
		return dequeue();
	}
	public int element() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[front];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
}
class QueueExample {

	public static void main(String[] args) {
		Queue inQ=new Queue(5);
		inQ.enqueue(1);
		inQ.enqueue(2);
		inQ.enqueue(3);
		inQ.enqueue(4);
		inQ.enqueue(5);
		inQ.dequeue();
		inQ.element();
		int v=inQ.element();
		System.out.println(v);
		inQ.display();
	}
}
