package ExceptionHandling;

public class HandlingDiffBlocks {

	public static void main(String[] args) {
		try {
			System.out.println("I am try block");
			int a=10,b=0,c=2,d;
			String str = null;
			d=a/b; // when try block is not executed
			System.out.println(d);
			System.out.println(str.toUpperCase()); 
		}
		catch(NullPointerException e){
			/*int x=10,y=0,z;
			z=x/y;
			System.out.println(z);    when catch block is not executed*/
			System.out.println("Error");
		}
		finally {
			/*int m=10,n=0,p;
			p=m/n;
			System.out.println(p); when finally block is not executed*/
			System.out.println("I am finally block");
		}
		System.out.println("I am another block");

	}

}
