package ProgramsUsingJavabasics;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		int p,n,r=1;
		System.out.println("Enter A number : ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("Enter power : ");
		p=sc.nextInt();
		
		for(int i=1; i<=p; i++) {
			r=r*n;
		}
        System.out.println("Power of "+n+" is: " +r);
	}

}
