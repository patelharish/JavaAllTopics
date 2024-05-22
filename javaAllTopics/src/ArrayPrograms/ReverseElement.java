package ArrayPrograms;

import java.util.Scanner;

public class ReverseElement {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		System.out.println("Enter elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();			
		}
		System.out.println("Array elements: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		System.out.println("reverse of Array elements: ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] +" ");			
		}
		
	}

}
