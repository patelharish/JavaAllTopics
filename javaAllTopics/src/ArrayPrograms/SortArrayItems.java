package ArrayPrograms;

import java.util.Scanner;

public class SortArrayItems {

	public static void main(String[] args) {
		// a[5]=56,76,43,59,.... to sort 43,56,59,76 ascending order
		
		int a[] = new int[6]; int temp;
		System.out.print("Enter array elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements :");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) // ascending order //to print descending order if(a[i]<a[j])
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
				
			}
		}
		System.out.println("\nSorted Array elements: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
