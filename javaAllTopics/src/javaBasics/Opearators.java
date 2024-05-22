package javaBasics;

import java.util.Scanner;

public class Opearators {

	public static void main(String[] args) {
           int a;
           int b;
           int Max;
           System.out.println("Enter two numbers: ");
           Scanner sc = new Scanner(System.in);
           a = sc.nextInt();
           b = sc.nextInt();
           
           // Arithmetic operators
           
           System.out.println("Addition : "+(a+b));
           System.out.println("Substraction : "+(a-b));
           System.out.println("multi : "+(a*b));
           System.out.println("div : "+(a/b));
           System.out.println("Reminder : "+(a%b));
           
           // Relational operators
           System.out.println("Relational operators...");
           System.out.println("true/false: " +(a<b));
           System.out.println("true/false: " +(a>b));
           System.out.println("true/false: " +(a<=b));
           System.out.println("true/false: " +(a>=b));
           System.out.println("true/false: " +(a==b));
           System.out.println("true/false: " +(a!=b));
           
           // Logical operators
           System.out.println("Logical operators...");
           // logical AND
           System.out.println("Logical AND....");
           System.out.println((a<b) && (a!=b));  // if both condition is true it returns true
           System.out.println((a<b) && (a==b));  // if one condition is true and second condition is false it returns false
           System.out.println((a>b) && (a>=b));  // if both condition is false it returns false
           // logical OR
           System.out.println("Logical OR...");
           System.out.println((a<b) || (a!=b));  // both true = true
           System.out.println((a<b) || (a==b));  // one true or second false = true
           System.out.println((a>b) || (a>=b));  // both false = false
           
           // increment & decrement operators
           System.out.println("post increment...");
           System.out.println(a++);
           System.out.println("pre increment...");
           System.out.println(++a);
           System.out.println("post decrement...");
           System.out.println(b--);
           System.out.println("pre decrement...");
           System.out.println(--b);
 
          /* System.out.println("Assignment operators...");
           System.out.println("simple operator...");
           int c;
           c=10;
           System.out.println(c);
           System.out.println("compound operator...");
           c+=10; // (c=c+10)
           System.out.println(a);
           c-=10; // (c=c-10)
           System.out.println(a);*/
           
           
           

           
           

           
           



           
           






           
           


           
         
	}

}
