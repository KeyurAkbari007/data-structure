class AllMethodsOfQueue{
	static int front=-1,rear=-1,temp;
	static int array[]=new int[10];
	public static void enque(int n){
		if(rear>=9){
			System.out.println("Queue Overflow");
		}
		else{
			if(rear==-1)
				front=0;
			rear++;
			array[rear]=n;
		}
	}
	public static int deque(){
		if(front>rear || rear==-1){
			System.out.println("Queue Underflow");
			return 0;
		}
		else{
			temp=front;
			front++;
			return array[temp];
		}
	}
	public static void display(){
		for(int i=front;i<=rear;i++){
			System.out.println("Queue element : "+array[i]);
		}
	}
}
class Queue{
	public static void main(String[] args) {
		AllMethodsOfQueue obj=new AllMethodsOfQueue();
		obj.enque(1);
		obj.enque(2);
		obj.enque(3);
		obj.enque(4);
		obj.enque(5);
		obj.enque(6);
		obj.enque(7);
		obj.enque(8);
		obj.enque(9);
		obj.enque(10);
		System.out.println("Deque element is : "+obj.deque());
		obj.display();
	}
}