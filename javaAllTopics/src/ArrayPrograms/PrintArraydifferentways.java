package ArrayPrograms;

import java.util.Arrays;

public class PrintArraydifferentways {

	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 4;
		arr[1] = 6;
		arr[2] = 9;
		arr[3] = 1;
		
		String[] str = {"harish","anuj","dharni","ashwini"};
		
		// declaring two dimentional array
		
		float[][] tda = {{1.2f, 4.5f}, {5.8f,6.3f}, {3.2f,4.9f}};
		
		// Using for loop:
		System.out.println("Using for loop: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// printing string array
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		// Using for each loop:
		System.out.println("Using for each loop: ");
		
		for(int st : arr) {
			System.out.println(st);
		}
		
		// by using Arrays.toString
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
		
		// by using Arrays.deepToString
		// it is use to print two dimentioanal array
		System.out.println(Arrays.deepToString(tda));
		
		// by using Arrays.asList
		// it is use to only print the string arrays elements
		System.out.println(Arrays.asList(str));
		System.out.println(Arrays.asList(arr));
		

	}

}
