package ExceptionHandling;

public class Simple {

	public static void main(String[] args) {
		
		try
		{
		int a=10; int b=0; int c;
		c=a/b; // occure exception i.e. ArithmaticException 
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Error: 10 is not divisible by 0");
		}
		System.out.println("hari");
	}

}
