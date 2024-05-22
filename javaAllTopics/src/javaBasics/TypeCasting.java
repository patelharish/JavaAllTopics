package javaBasics;

public class TypeCasting {

	public static void main(String[] args) {
       // implicit type casting
		int a= 10;   // 4 bytes
		double b=a; // 8 bytes
		System.out.println(b);
		
		// Explicit type Casting
		 
		double c = 10.2; // 8 bytes
		int d =(int) c;        // 4 bytes
		System.out.println(d);
		float e= 13.4f;
		int f = (int)e;
		System.out.println(f);
	}

}
