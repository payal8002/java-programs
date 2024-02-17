package cj3Program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n, arm =0,rem,c;
		Scanner s = new Scanner(System.in);
       System.out.println("Enter a number");
       n=s.nextInt();
       c=n;
       while(n>0){
    	   rem=n%10;
    	   arm=(rem*rem*rem)+arm;
    	   n=n/10;
    	   	   
       }
       
	
	if(c==arm)
		System.out.println("\n It is a Armstrong Number");
	else 
	System.out.println("\n It is a not Armstrong Number");

		}

	
		
	}


