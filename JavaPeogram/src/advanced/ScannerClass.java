package advanced;
 import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any name");
		String name = read.next();
		System.out.println("Enter your age in years");
		int age = read.nextInt();
		System.out.println("Emter your salary");
		double salary = read.nextDouble();
		System.out.println("Enter any message");
		read = new Scanner(System.in);
		String msg = read.nextLine();
		
		System.out.println("\n=======================================================");
		System.out.println("Hello, "+name);
		System.out.println("You are "+age);
		System.out.println("You are earning RS. "+ salary +"per month. ");
		System.out.println("Words from "+name+"-"+msg);

	}

}
