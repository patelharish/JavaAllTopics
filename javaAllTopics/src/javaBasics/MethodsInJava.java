package javaBasics;

public class MethodsInJava {
	int n1=45;   // instance var
	static int n2= 50; // static var

	public static void main(String[] args) {		
		MethodsInJava h = new MethodsInJava();
		h.run();
		add();
		
	}
	
	// non static method
	void run() {
		System.out.println("hi method");
		System.out.println(n1 +" " +n2); // access instance and static var
	}
	
	// static method
	static void add() {
		int a=2, b=6, c;
		c=a+b;
		System.out.println(c);
		System.out.println(n2); // access only instance var
	}

}
