package ProgramsUsingJavabasics;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		// calculate avg of 5 subjects marks
		int a,b,c,d,e,sum;
		System.out.println("Enter all 5 subjects marks: " );
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		// total sum of subjects
		sum = a+b+c+d+e;
		System.out.println("Total sum of subjects: " +sum);
		
		double avg;
		avg= sum/5.0;
		System.out.println("Avg of subjects : " +avg);


	}

}
