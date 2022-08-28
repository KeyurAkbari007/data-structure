import java.util.Scanner;
class Link{
	static Node head;
	static int temp;
	static node tail;
	static class Node{
		int value;
		Node next;
		int temp;
		Node(int n){
			value=n;
			next=null;

		}
	}
	static Node insert(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			tail=mNode;
			return head;.
		}
		else{
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

	static void delete(int n){
		Node lastNode = head;
		Node prev = null;
		if(lastNode.value==n){
			System.out.println("abc");
				head=lastNode.next;
		}
		else{
			while(lastNode.next!=null){
			 if(lastNode.value==n){
				prev.next=lastNode.next;
			System.out.println("matched");
			break;
			} 	
			prev=lastNode;
			lastNode=lastNode.next;	
			}
			if(lastNode.value==n){
				prev.next=null;
			}
		}
		
}

	static void display(){
		if(head==null){
			System.out.println("Empty");
		}
		else{
			System.out.print("\nLinked List :");
			Node lastNode = head;
			Node next =null;
			while(lastNode!=null){
				next = lastNode.next;
				while(next!=null){
					if(next.value<lastNode.value){		
						temp = next.value;
						next.value = lastNode.value;
						lastNode.value = temp;
					}
					next=next.next;
				}
				lastNode = lastNode.next;	
			}
			lastNode=head;
			while(lastNode.next!=null){
				System.out.print(lastNode.value+" => ");
				lastNode=lastNode.next;
			}
			System.out.print(lastNode.value);	
		}
	}
}

class Sorted_Linked_list{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Link obj = new Link();
		System.out.print("Enter no. of Stack element : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element of Stack : ");	
			obj.insert(sc.nextInt());
		}

		obj.display();
	}
}