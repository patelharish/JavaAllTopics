package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayItemsUsingArraysClass {

	public static void main(String[] args) {
		int a[] = new int[5]; 
		System.out.print("Enter array elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("\nsorted array elements: ");
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
