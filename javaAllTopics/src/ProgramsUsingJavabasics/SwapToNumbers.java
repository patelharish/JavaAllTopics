package ProgramsUsingJavabasics;

import java.util.Scanner;

public class SwapToNumbers {

	public static void main(String[] args) {
	  int a,b,temp;
	  System.out.println("Enter two numbers : ");
	  Scanner sc = new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  System.out.println("Before swapping "+a+" "+b);
	  temp = a;
	  a=b;
	  b=temp;
	  System.out.println("After swapping "+a+" "+b);

	  

	}

}
