package ProgramsUsingJavabasics;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
         int n;
         System.out.println("Enter a number: ");
         Scanner sc = new Scanner(System.in);
         n=sc.nextInt();
         
    if(n%2==0) {
    	System.out.println("number is Even");
    }
    else {
    	System.out.println("number is odd");
    }
	}

}