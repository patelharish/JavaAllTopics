package ArrayPrograms;

import java.util.Scanner;

public class PrintMatrixTwoDime {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		System.out.print("Enter Elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
        System.out.print("Matrix is : \n");
        for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.print("\n");
		}
	}

}
