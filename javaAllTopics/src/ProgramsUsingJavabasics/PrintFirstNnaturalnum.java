package ProgramsUsingJavabasics;

import java.util.Scanner;

public class PrintFirstNnaturalnum {

	public static void main(String[] args) {
		// natural numb : 1,2,3,4....infinite
		int n;
		System.out.println("Enter no. of term: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println(i +" " );
		}
	}

}
