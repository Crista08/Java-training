class StackExample {
	private int[] stack;
	private int top;
	private int maxSize;
	public StackExample(int size) {
		stack=new int[size];
		maxSize=size;
		top=-1;
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return top;
		}
		return stack[top--];
	} 
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty by peek");
			return -1;
		}
		return stack[top];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
}
class StackEg{
	public static void main(String[] args) {
		StackExample s=new StackExample(5);
		s.push(1);
		s.push(2);
		s.pop();
		s.push(3);
		s.push(4);
		s.peek();
		s.push(7);
		s.pop();
		s.pop();
		s.push(6);
		s.peek();
		s.push(8);
		s.pop();
		s.push(5);
		s.display();
	}

}
