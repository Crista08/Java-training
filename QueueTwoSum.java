class queue {
	private int[] queue;
	private int front,rear,maxSize;
	public queue(int size) {
		maxSize=size;
		queue=new int[maxSize];
		front=-1;
		rear=-1;
	}
	public boolean isEmpty() {
		return front==-1&&rear==-1;
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
 class QueueTwoSum {

	public static void main(String[] args) {
		queue q=new queue(5);
		queue inQ=new queue(5);
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(4);
		q.enqueue(9);
		q.enqueue(8);
		inQ.enqueue(3);
		inQ.enqueue(6);
		inQ.enqueue(5);
		inQ.enqueue(2);
		inQ.enqueue(10);
		queue output=new queue(5);
		while(!q.isEmpty()&&!inQ.isEmpty()) {
			int v1=q.poll();
			int v2=inQ.poll();
			int k=11;
			if(v1+v2==k) {
				output.enqueue(v1);
				output.enqueue(v2);
			}
		}
		output.display();
	}
}