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
			System.out.print(stack[i]+" ");
		}
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
}
class StackSortReverse{
	public static void main(String[] args) {
		StackExample s1=new StackExample(5);
		StackExample s2=new StackExample(5);
		StackExample output=new StackExample(10);
		StackExample output2=new StackExample(10);
		s1.push(2);
		s1.push(4);
		s1.push(6);
		s1.push(8);
		s1.push(10);
		System.out.println("Stack 1");
		s1.display();
		s2.push(1);
		s2.push(3);
		s2.push(5);
		s2.push(7);
		s2.push(9);
		System.out.println();
		System.out.println("Stack 2");
		s2.display();
		while(!s1.isEmpty()&&!s2.isEmpty()){
			int v1=s1.pop();
			int v2=s2.pop();
			output.push(v1);
			output.push(v2);
		}
		System.out.println();
		System.out.println("The sorted stack is : ");
		output.display();
		while(!output.isEmpty()) {
			output2.push(output.pop());
		}
		
		System.out.println();
		System.out.println("The reversed stack is : ");
		output2.display();
	}
}

