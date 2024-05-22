package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestElement {

	public static void main(String[] args) {		
			int a[] = new int[5];
			System.out.println("Enter array elemts: ");
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			// itrative ways

			int min = a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];
				}
			}
			System.out.println("largest elements array is: " + min);
			
			// by using streams 
			int min2 = Arrays.stream(a).min().getAsInt();
			System.out.println("largest elemeent in array is : " +min2);
			
			// by using sorting

			Arrays.sort(a);

			int min3 = a[0];
			System.out.println("Largeest element in array is : " + min3);

	}

}
