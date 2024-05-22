package ProgramsUsingJavabasics;

import java.util.Scanner;

public class SumOfEvenOrOdd {

	public static void main(String[] args) {
		int n, i, sum = 0;
		System.out.println("Enter no of terms");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		if (n % 2 == 0) {
			for (i = 0; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("Sum of Even numbers: " + sum);
		}

		else {
			for (i = 1; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("Sum of odd numbers: " + sum);

		}
	}

}
