import java.util.Scanner;
class array_replace_with_second_num{
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("enter n");

		int n=sc.nextInt();
		System.out.println("enter n1");
	    int n1=sc.nextInt();
	    System.out.println("enter n2");
         int n2=sc.nextInt();




		int[] a=new int[n];
		for (int i=0;i<a.length ;i++) {
	    System.out.println("enter array elements");

			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length ;i++ ) {
			if (a[i]==n1) {
				a[i]=n2;
			}
		}
	
		for (int i=0;i<a.length;i++) {
				for ( i=0;i<a.length ;i++) {
			System.out.println(a[i]);
		}
		}

	}
}
