package cj3Program;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		n=s.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum=0;
			}
		}
		if(n==sum)
			System.out.println("\n It is a Perfect Number");
		else
			System.out.println("\n It is not Perfect Number ");
		
	}

}
