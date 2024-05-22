package ProgramsUsingJavabasics;

import java.util.Scanner;

public class SumOfNnaturalNo {

	public static void main(String[] args) {
		// natural number: 1,2,3,4.....
		int n,sum = 0;
		System.out.println("Enter No of terms: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		System.out.println("Addition is: "+sum);

	}

}
