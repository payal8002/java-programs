package advanced;

import java.util.Scanner;//step1
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter your full name");

String fullName = sc.nextLine();
	System.out.println("Enter your user name");
	String userName = sc.next();
	System.out.println("Enter your age ");
	int age = sc.nextInt();
	System.out.println("Enter your marks");
	double marks = sc.nextDouble();
	System.out.println("Enter your Gender");
	String gender = sc.next();
	char c = gender.charAt(0);
   
	System.out.println("Full Name: "+fullName);
	System.out.println("User Name: "+userName);
	System.out.println("Age: "+age);
	System.out.println("Marks: "+marks);
	System.out.println("Gender: "+c);
		

	}

}
