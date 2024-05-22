package javaBasics;

public class VariablesInJava {
	int x=10;// instance
	static int z= 20;// static
	public static void main(String[] args) {
		int y = 30; // local
		VariablesInJava var = new VariablesInJava();
		System.out.println(var.x);
		System.out.println(VariablesInJava.z);
		System.out.println(y);
	}
		

}
