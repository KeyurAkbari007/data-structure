import java.util.Scanner;
class Method_Implement_Demo{
	static char c;
	static String str2="";
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
			c = array[top];
			top--;
			return c;
		}
	}
	public static void checkPalindrome(String str){
		for(int i=0;i<str.length();i++){
			str2=str2+pop();
		}
		if(str2.equals(str)){
			System.out.println(str+" is palindrome string");
		}
		else{
			System.out.println(str+" is not palindrome string");
		}
	}
}
class Palindrome_String_Using_Statck{
	public static void main(String[] args) {
		Method_Implement_Demo mid=new Method_Implement_Demo();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			mid.push(str.charAt(i));
		}
		mid.checkPalindrome(str);
	}
}