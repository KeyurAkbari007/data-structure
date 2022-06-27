import java.util.Scanner;
public class Addition_two_Matrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows of matrices : ");
		int r=sc.nextInt();
		System.out.print("Enter number of columns of matrices : ");
		int c=sc.nextInt();
		int array1[][]=new int[r][c];
		int array2[][]=new int[r][c];
		int additionArray[][]=new int[r][c];
		// Scan 1st array
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter element of "+i+" row and "+j+" column of 1st array : ");
				array1[i][j]=sc.nextInt();
			}
		}
		// Scan 2nd array
		System.out.println("-----------------------------------------");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter element of "+i+" row and "+j+" column of 2nd array : ");
				array2[i][j]=sc.nextInt();
			}
		}
		// Addition
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				additionArray[i][j]=array1[i][j]+array2[i][j];
			}
		}
		// print addition
		System.out.println("-------Addition of arrays-------");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("\t"+additionArray[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}	
}