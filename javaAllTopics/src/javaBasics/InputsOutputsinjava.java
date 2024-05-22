package javaBasics;

import java.util.Scanner;

public class InputsOutputsinjava {

	public static void main(String[] args) {
		int num;
		String name;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Your number is: " +num);
        System.out.print("Enter name: ");   
        Scanner str = new Scanner(System.in);
        name= str.nextLine();
        System.out.print("your name is: "+name);

        
	}

}
