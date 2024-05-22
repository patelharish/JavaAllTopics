package javaBasics;

class B {
	int a;
	String b;

	B() // default constructor
	{
		a = 0;
		b = null;
	}

	void show() {
		System.out.println(a + " " + b);
	}
}

public class Constructor {
	public static void main(String[] args) {
		B ref = new B();
		ref.show();

	}
}
