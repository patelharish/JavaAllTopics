package ProgramsUsingJavabasics;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// 25 = 5
		int n;
		double sq;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sq= Math.sqrt(n);
		System.out.println(sq);
	}

}
