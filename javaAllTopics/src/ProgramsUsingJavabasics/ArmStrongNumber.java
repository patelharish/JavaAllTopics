package ProgramsUsingJavabasics;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// Armstrong number : 153 ...(1*1*1 + 5*5*5 + 3*3*3) = 153

		int n, c, rem, arm = 0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = n;

		while (n > 0) {
			rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;
		}
		if (c == arm) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");

		}
	}

}
