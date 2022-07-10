/* Java program to implement basic stack
operations */
class Stack {
	static final int MAX = 10;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}

	boolean push(int x)
	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false; 
		}
		else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	// int pop()
	// {
	// 	if (top < 0) {
	// 		System.out.println("Stack Underflow");
	// 		return 0;
	// 	}
	// 	else {
	// 		int x = a[top--];
	// 		return x;
	// 	}
	// }

	// int peek()
	// {
	// 	if (top < 0) {
	// 		System.out.println("Stack Underflow");
	// 		return 0;
	// 	}
	// 	else {
	// 		int x = a[top];
	// 		return x;
	// 	}
	// }


	// int peep(int i)
	// {
	// 	if (top-i+1<0) {
	// 		System.out.println("Stack Underflow");
	// 		return 0;
	// 	}
	// 	else {
	// 		int x = a[top-i+1];
	// 		return x;
	// 	}
	// }

	int change(int z,int i)
	{
		if (top-i+1<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			a[top-i+1]=z;
			return a[top-i+1];
		}
	}

	
	
	void print(){
	for(int i = top;i>=0;i--){
	System.out.print(" "+ a[i]);
	}
}
}

// Driver code
class a2 {
	public static void main(String args[])
	{
		int z=5;
		int i=2;
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		// System.out.println(s.pop() + " Popped from stack");
		// System.out.println("Top element is :" + s.peek());
	   // System.out.println("peep element is :" + s.peep(i));
	   	   System.out.println("change element is :" + s.change(z,i));


		System.out.print("Elements present in stack :");
		s.print();
	}
}
