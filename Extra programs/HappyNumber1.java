import java.util.Scanner;
class HappyNumber1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		int sum[]=new int[100];
		sum[0]=0;
		int temp=0;
		int r;
		boolean flag=true;
			for(int i=1;i<100;i++){
				while(n!=0){
					r=n%10;
					n=n/10;
					temp+=r*r;
					sum[i]=temp;
					for(int j=1;j<i;j++){
						if(sum[j]==temp){
							flag=false;
							break;
						}
					}
				}
				if(!flag){
					break;
				}
				n=temp;
				temp=0;
				if(n==1){
					break;
				}
			}
			if(flag){
				System.out.println("Given number is Happy Number");
			}
			else{
				System.out.println("Given number is not Happy Number");
			}
		
	}
}