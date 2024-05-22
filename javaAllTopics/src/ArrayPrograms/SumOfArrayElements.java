package ArrayPrograms;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a[] = new int[5]; int sum =0;
		System.out.println("Enter elements: ");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			sum = a[i]+sum;
		}
		System.out.println("\nAddition of Array Elements is : " +sum);

	}

}
