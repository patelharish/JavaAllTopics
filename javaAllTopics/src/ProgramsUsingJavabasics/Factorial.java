package ProgramsUsingJavabasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// factorial 5 = 5*4*3*2*1
		
		int n,fact = 1;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial is: " +fact);
		

	}

}
