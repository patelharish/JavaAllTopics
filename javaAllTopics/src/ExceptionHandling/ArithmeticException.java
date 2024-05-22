package ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c;
		c=a/b; //occure ArithmeticException
		System.out.println(c); 
		}
		catch(Exception e) {
			System.out.println("we can't devide 0 ");
		}
		System.out.println("another statement");

	}
}
