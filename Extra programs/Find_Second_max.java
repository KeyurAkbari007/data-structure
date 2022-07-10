import java.util.Scanner;
class Find_Second_max{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		for (int i=0;i<l ;i++ ) {
			System.out.println("enter eliment");
			a[i]=sc.nextInt();
		}
		max=a[0],max2=a[0];
		for (int i=1;i<l ;i++ ) {
			if (max<=a[i]) {
				max2=max;
				max=a[i];
			}
		}
		
	}
}