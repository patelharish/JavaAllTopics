package ProgramsUsingJavabasics;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
       int a,b,sum;
       System.out.println("Enter two Number: ");
       Scanner sc = new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       sum= a+b;
       System.out.println("Addition is: "+sum);

	}

}
