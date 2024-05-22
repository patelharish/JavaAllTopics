package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindBiggestElements {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Enter array elemts: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// by using sorting

		Arrays.sort(a);

		int max = a[a.length - 1];
		System.out.println("Largeest element in array is : " + max);

		// itrative ways

		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max2) {
				max2 = a[i];
			}
		}
		System.out.println("largest elements array is: " + max2);
		
		// by using streams 
		int max3 = Arrays.stream(a).max().getAsInt();
		System.out.println("largest elemeent in array is : " +max3);
	}

}
