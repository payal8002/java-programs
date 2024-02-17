package cj3Program;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		int i;
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		num = s.nextInt();
        for( i=2;i<num; i++) {
        	if(num%i==count) {
        		count++;
        		
        	}
        }
        if(count==0)
        	System.out.println("\n It is Prime Number");
        else
        	System.out.println("\n It is a not Prime Number");
	}

}
