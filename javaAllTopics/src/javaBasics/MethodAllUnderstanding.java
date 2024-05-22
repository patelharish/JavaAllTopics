package javaBasics;

import java.util.Scanner;

public class MethodAllUnderstanding {
	int a, b;
	int add, sub, multi, div, rem;

	public static void main(String[] args) {
		MethodAllUnderstanding ref = new MethodAllUnderstanding();
		ref.input();
		ref.process();
		ref.output();
	}

	void input() {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	}

	void process() {
		add = a + b;
		sub = a - b;
		multi = a * b;
		div = a / b;
		rem = a % b;
	}
	
	void output() {
		System.out.println("Addition: " +add);
		System.out.println("Subtraction: " +sub);
		System.out.println("Multiplication: " +multi);
		System.out.println("Division: " +div);
		System.out.println("Reminder: " +rem);
	}

}
