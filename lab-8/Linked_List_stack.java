

import java.util.Scanner;

class Link{
	static Node head;
	static Node top=null;
	static Node temp;
	static Node tail;
	// static Node prev=null;
	
	static class Node{
		int value;
		Node next;
		Node prev;
		Node(int n){
			value=n;
			next=null;
			prev=null;
		}
	}

	public void push(int n){
			top = insert(n);
	}
	public int pop(){
		if(top==null){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			temp=top;
			top = delete();
			return temp.value;
		}		
	}
	static Node insert(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			tail=mNode;
			return head;
		}
		else{
			mNode.prev=tail;
			tail.next=mNode;
			tail=mNode;
			return mNode;
		}
	}
	// static void deleteAtlast(){
	// 	if(head==null){

	// 	}
	// 	else{
	// 		Node lastNode=head;
	// 		while(lastNode.next.next!=null){
	// 			lastNode=lastNode.next;
	// 		}
	// 		lastNode.next=null;
	// 	}
	// }
	static Node delete(){
			tail=tail.prev;
			tail.next=null;
			return tail;	
		
}

	static void display(){
		
		if(head==null){
			System.out.println("Empty");
		}
		else{
			System.out.print("\nLinked List :");
			Node lastNode = head;
			while(lastNode.next!=null){
				System.out.print(lastNode.value+" => ");
				lastNode=lastNode.next;
			}
			System.out.print(lastNode.value);
			
		}
	}
}

class Linked_List_stack{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Link obj = new Link();
		System.out.print("Enter no. of Stack element : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element of Stack : ");	
			obj.push(sc.nextInt());
		}
		obj.display();

		// System.out.println("Popped Element : "+obj.pop());


		// obj.display();
		// System.out.println("Popped Element : "+obj.pop());
		// System.out.println("Popped Element : "+obj.pop());
		// System.out.println("Popped Element : "+obj.pop());

		
	}
}