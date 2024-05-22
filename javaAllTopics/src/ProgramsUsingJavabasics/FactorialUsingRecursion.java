package ProgramsUsingJavabasics;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		FactorialUsingRecursion ref = new FactorialUsingRecursion();
		int result=ref.fact(n);
		System.out.println(result);

	}
	
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			
			return n*fact(n-1);			
		}
		
	}

}
