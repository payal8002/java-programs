package advanced;

import java.util.Scanner;

public class UsersInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//object creation
		System.out.println("Please Enter the Name of Employee: ");
		String empName = scan.nextLine();
		System.out.println("Please Enter the ID of Employee: ");
		int empId =scan.nextInt();
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID: "+empId);

	}

}
