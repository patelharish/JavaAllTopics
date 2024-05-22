package Polymorphism;

// compiletimepoly or method overloading : method same and different parameter
public class CompileTimePoly {

	public static void main(String[] args) {
		A r = new A();
		r.add();
		r.add(100, 200);
		r.add(20, 45.54);

	}
}

class A {
	void add() 
	{
		int a = 10;
		int b = 20;
		int c;
		c = a + b;
		System.out.println(c);
	}

	void add(int x, int y) 
	{
		int c;
		c = x + y;
		System.out.println(c);
	}

	void add(int x, double y) 
	{
		double c;
		c = x + y;
		System.out.println(c);
	}
}
