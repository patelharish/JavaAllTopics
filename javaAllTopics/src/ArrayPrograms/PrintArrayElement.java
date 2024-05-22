package ArrayPrograms;

import java.util.Arrays;

public class PrintArrayElement {

	public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // first way to print array elements by using for loop
        
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i] +" ");
        }
        
        // using for each loop
        
        for(int b : arr) {
        	System.out.println(b);
        }
        
        // using some inbuild method 
        
        System.out.println(Arrays.toString(arr)); // this method prints bracket also
        System.out.println(Arrays.asList(arr));
        
        // multidimention array
        
        int mlt[][] = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(mlt));
        System.out.println(mlt.length);
	}

}
