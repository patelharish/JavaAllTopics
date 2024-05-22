package ProgramsUsingJavabasics;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n,r,sum=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();	
		
		while(n>0) {
			r=n%10;  // print reminder
			sum = sum+r;
			n=n/10;  // remove reminder
		}
		System.out.println("sum of digits: " +sum);
	}

}
