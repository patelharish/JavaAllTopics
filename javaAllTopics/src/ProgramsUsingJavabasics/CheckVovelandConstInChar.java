package ProgramsUsingJavabasics;

import java.util.Scanner;

public class CheckVovelandConstInChar {

	public static void main(String[] args) {
        char ch;
        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        	System.out.println("Given character is Vovel");
        }
        else {
        	System.out.println("Given character is consonant");

        }
	}

}
