public class testarray{
	public static void main(String[] args) {
		int a[]={1,1,1,2,2,2,3,3,3,4,4,4,5,5};
		int count=0;
		int flag=0,n=1;
 

		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				System.out.print(0);
			}
			else if(a[i]==a[i+1]){
				count++;
			}
			else{
				n++;
			}
			if(count>=2){
				flag++;
				count=0;
			}
						
		}
		if(flag==n){
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}
	}
}