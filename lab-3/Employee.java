import java.util.Scanner;
class Employee{
	int employee_id;
	String name;
	String designation;
	double salary;
	// read details
	public void readDetais(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee_id : ");
		employee_id=sc.nextInt();
		System.out.print("Enter name of employee : ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter designation of employee : ");
		designation=sc.nextLine();
		System.out.print("Enter salary of employee : ");
		salary=sc.nextDouble();
	}
	// print details
	public void printDetais(){
		System.out.println("----------------------------");
		System.out.println("Employee_id : "+employee_id);
		System.out.println("Name of employee : "+name);
		System.out.println("Designation of employee : "+designation);
		System.out.println("Salary of employee : "+salary);
	}
}
public class Employee{
	public static void main(String[] args) {
		Employee_Detail ed = new Employee_Detail();
		ed.readDetais();
		ed.printDetais();
	}
}