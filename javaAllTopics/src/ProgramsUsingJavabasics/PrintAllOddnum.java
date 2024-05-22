package ProgramsUsingJavabasics;

import java.util.Scanner;

public class PrintAllOddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      System.out.println("Enter number of term: ");
      Scanner sc = new Scanner(System.in);
      n= sc.nextInt();
      System.out.println("odd numbers are: ");
      for(int i=1; i<=n; i++) {
    	  if(i%2==1) {   		  
    		  System.out.println(i);
    	  }
      }
      // Another way 
      System.out.println("Another way to print odd numbers...");
      for(int i=1; i<=n; i=i+2) {
    	  System.out.println(i);
      }
	}

}
