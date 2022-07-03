import java.util.Scanner;
public class Find_Angle_In_Clock{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours : ");
		int hour = sc.nextInt();
		System.out.print("Enter minutes : ");
		int minit = sc.nextInt();

		if(minit>=60){
			minit-=60;
			hour++;
		}
		if(hour>=12)
			hour-=12;

		double hourAngle= (hour * 30)  + (minit / 2);
		double minitAngle= (minit * 6);

		double angle;
		angle=Math.abs(hourAngle-minitAngle);

		System.out.println("Angle is : "+Math.min(angle,360-angle)+" degree");
	}
}
