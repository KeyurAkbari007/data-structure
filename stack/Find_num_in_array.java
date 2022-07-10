import java.util.Scanner;
class StackDemo{
	static int array[]=new int[100];
	static int top=-1;
	public static void push(int n){
		if(top>=100){
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			array[top]=n;
		}
	}
	public static  int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int n = array[top];
			top--;
			return n;
		}
	}
	public static boolean find(int a,int m){
		if(a==m){
			return true;
		}
		else if(top>=0){
			a=pop();
			return find(a,m);
		}
		else{
			return false;
		}
	}
}

public class Find_num_in_array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackDemo sd=new StackDemo();
		System.out.print("Enter size of array : ");
		int l=sc.nextInt();
		for(int i=0;i<l;i++){
			System.out.print("Enter array element : ");
			sd.push(sc.nextInt());
		}
		System.out.print("Enter no. you want to find : ");
		int m=sc.nextInt();
		int a=sd.pop();
		boolean flag=sd.find(a,m);
		if(flag){
			System.out.println("Number is found");
		}
		else
			System.out.println("Number is not found");
	}
}