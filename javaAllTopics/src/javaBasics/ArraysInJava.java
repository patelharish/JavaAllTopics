package javaBasics;

public class ArraysInJava {

	public static void main(String[] args) {

		// one dimention array
		int a[] = { 10, 20, 30, 40 };
		// System.out.println(a[0]);
		System.out.println(a[2]);

		// another way
		int b[] = new int[5];
		b[0] = 11;
		b[1] = 22;
		b[2] = 33;
		b[3] = 44;
		b[4] = 55;

		System.out.println(b[2]);
		System.out.println(b.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// Multidimention array

		int mlt[][] = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9} };
		for (int i = 0; i < mlt.length; i++) {
			for (int j = 0; j < mlt[i].length; j++) {
				System.out.print(mlt[i][j] + " ");
			}
			System.out.println();
		}

	}

}
