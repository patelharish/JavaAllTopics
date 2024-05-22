package ProgramsUsingJavabasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// palindrome 121.... reverse....== 121 is called palindrome
		
		int n,c,r,s=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		c=n;
		
		while(n>0) {
			r= n%10;  // reminder
			
			s=(s*10)+r;
			
			n=n/10;
			
		}
		if(c==s) {
			System.out.println("Number is palindrome");

		}
		else {
			System.out.println("Number is not palindrome");

		}
		

	}

}
