import java.util.*;
class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;

		while(n>9){
			while(n>0)
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
			sum=0;
		}
		if(n==1)
		{
			System.out.println("happy num");
		}
		else{
						System.out.println("not happy num");

		}
	}
}