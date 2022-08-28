import java.util.Scanner;
class RevPol{
	static char a[]=new char[100];
	static int top=-1,rank=0,ipf,spf;
	static char s,next,temp;
	static String polish="";
	static boolean flag=true;
	public static int ipf(char c){
		if(c=='+'||c=='-'){
			ipf=1;
		}
		else if(c=='*'||c=='/'){
			ipf=3;
		}
		else if(c=='^'){
			ipf=6;
		}
		else if(c=='('){
			ipf=9;
		}
		else if(c==')'){
			ipf=0;
		}
		else{
			ipf=7;
		}
		return ipf;
	}
	public static int spf(char c){
		if(c=='+'||c=='-'){
			spf=2;
		}
		else if(c=='*'||c=='/'){
			spf=4;
		}
		else if(c=='^'){
			spf=5;
		}
		else if(c=='('){
			spf=0;
		}
		else{
			spf=8;
		}
		return spf;
	}
	public static int findRank(char s){
		int r;
		if(s=='+'||s=='-'||s=='*'||s=='/'||s=='^'){
			r=-1;
		}
		else{
			r=1;
		}
		return r;
	}
	public static void push(char c){
		if(top>=100){
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			a[top]=c;
		}
	}
	public static char pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			 s=a[top];
			 top--;
			 return s;
		}
	}
	public static void polishString(String str){
		for(int i=0;i<str.length();i++){
			next=str.charAt(i);
			while(next!=' '){
				if(top<0){
					System.out.println("Invalid string.");
					flag=false;
					break;
				}
				while(spf(a[top])>ipf(next)){
					temp=pop();
					polish=polish+temp;
					rank=rank+findRank(temp);
					if(rank<1){
						System.out.println("Invalid String");
						flag=false;
						break;
					}
				}
				if(!flag){
					break;
				}
				if(spf(a[top])!=ipf(next)){
					push(next);
				}
				else{
					pop();
				}
				break;
			}
		}
		if(top!=0 || rank!=1){
			if(flag){
			System.out.println("Invalid String");
			}
		}
		else{
			System.out.println("Valid String");
			System.out.println("Polish string : "+polish);
		}
	}
}
class infix_to_postfix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.next();


		RevPol obj=new RevPol();
		obj.push('(');

		obj.polishString(str);
	}
}