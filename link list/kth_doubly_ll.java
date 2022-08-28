
 import java.util.Scanner;
class List{
		static int tempValues=0;
		static Node tempDemo=null;
	 static Node head=null,tail=null;
	 static boolean flag=true;
	//  static int count=0;
	static class Node{
		int data;
		Node next;
		Node prev;
			public Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public static int deleteByUserChoicePattern(int n){
		if(flag){
			tempDemo=head;
			flag=false;
		}
		if(tempDemo.next==tempDemo || tempDemo.prev==tempDemo){
			tempValues=delete(tempDemo.data);
			return tempValues;
		}
		else{
			for(int i=1;i<n;i++){
				tempDemo=tempDemo.next;
			}	
			tempValues=delete(tempDemo.data);
			tempDemo=tempDemo.next;
			return tempValues;
		}
		
	}
	public static void insertLast(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			tail=mNode;
			tail.next=head;
			head.prev=head;
			// count++;
		}
		else{
			tail.next=mNode;
			mNode.prev=tail;
			tail=mNode;
			mNode.next=head;
			head.prev=mNode;
			// count++;
		}
	}

	public static int delete(int d){
		Node tempNext,tempPrev=tail,temp;
		temp=head;
		tempNext=temp.next;
		if(head.data==d){
			head=head.next;
			head.prev=tail;
			tail.next=head;	
		}
		else if(tail.data==d){
			tail=tail.prev;
			tail.next=head;
			head.prev=tail;
		}
		else{
			while(tempNext!=head){
				if(temp.data==d){
					tempPrev.next=tempNext;
					tempNext.prev=tempPrev;
                    // break;

				}
				tempPrev=temp;
				temp=temp.next;
				tempNext=temp.next;
			}

		}
		return d;
	}
	public static void display(){
		// head=tail;
		Node temp2=head;
		System.out.print("Linked List : ");
		while(temp2.next!=head){
			System.out.print(temp2.data+" => ");
			temp2=temp2.next;
		}
		System.out.print(" "+temp2.data+"\n");
	}
}

class kth_doubly_ll{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of element of Linked List : ");
		int n=sc.nextInt();
		System.out.print("Enter no. of element which sequence is used to get element from Linked List : ");
		int m=sc.nextInt();
		String str="";
		
		List obj = new List();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element no. "+i+" of LinkedList : ");
			obj.insertLast(sc.nextInt());
		}
		// obj.display();
		for(int i=1;i<=n;i++){
			str+=obj.deleteByUserChoicePattern(m);
			if(i<=n){
				str+=",";
			}
			else{
				str+=".";
			}

		}
		System.out.println(str);
	}
}
