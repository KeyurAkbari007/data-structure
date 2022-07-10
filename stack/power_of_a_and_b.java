import java.util.Scanner;
class Method_Implement_Demo{
	static int a=0;
	static int b=0;
	static char array[]=new char[100];
	static int top=-1;
	public static void push(char n){
		if(top>=10){
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			array[top]=n;
		}
	}
	public static char pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			char s = array[top];
			top--;
			return s;
		}
	}
	
	public static void power(int l){
		for(int i=0;i<l;i++){
			char s=pop();
			if(s=='a'){
				a++;
			}
			if(s=='b'){
				b++;
			}
		}
		if(a==b){
			System.out.println("Power of a and b are equal");
		}
		else {
			System.out.println("Power of a and are not equal");
		}
	}
}

class power_of_a_and_b{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Method_Implement_Demo mid=new Method_Implement_Demo();
		System.out.println("Enter a String : ");
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++){
			mid.push(str.charAt(i));
		}
		mid.power(l);

	}
}

