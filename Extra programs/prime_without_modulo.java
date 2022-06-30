class prime_without_modulo{
	public static void main(String[] args) {
		int n=4;
		int n1,a,flag=0;
		n1=n;
		a=n;

		for (int i=2;i<n ;i++ ) {
			a=n1;
			while(a>=0)
			{
				if (a!=0) {
				a=a-i;
				}
				else
				{
					flag=1;
					break;
				}
			}
			if (flag==1) {
				break;
			}
		}
		if (flag==1) {
			System.out.println("not prime");
		}
		else
		{
	     	System.out.println("prime");

		}
	}
}