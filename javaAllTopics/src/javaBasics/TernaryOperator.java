package javaBasics;

public class TernaryOperator {

	public static void main(String[] args) {
       int a=10, b=20, c=30, Max;
       Max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
       System.out.println(Max);
	}

}
