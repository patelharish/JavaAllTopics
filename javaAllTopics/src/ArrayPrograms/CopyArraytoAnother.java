package ArrayPrograms;

import java.util.Scanner;

public class CopyArraytoAnother {

	public static void main(String[] args) {
		// a[] = 10,20,30 ....copy to  b[] = 10,20,30
		
		int a[] = new int[5];
		int b[] = new int[5];
		System.out.println("enter first array elements: ");		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("First array elements: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println("\ncopied array into second: ");
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] +" ");
		}
		
	}

}
