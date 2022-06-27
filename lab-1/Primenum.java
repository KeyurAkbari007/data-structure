import java.util.Scanner;
public class Primenum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				flag=false;
		}
		if(flag)
			System.out.println("Given number is Prime");
		else
			System.out.println("Given number is not Prime");
	}
}