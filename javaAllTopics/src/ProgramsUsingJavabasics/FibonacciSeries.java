package ProgramsUsingJavabasics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// fibonacci series : 0 1 1 2 3 5 8 13 .... addition of first two digits
		
		int term,a=0,b=1,c;
		System.out.println("Enter terma: ");
		Scanner sc = new Scanner(System.in);
		term = sc.nextInt();
		for(int i=1; i<=term; i++) {
			System.out.println(a +" ");
			c=a+b;
			a=b;
			b=c;
		}
		

	}

}
