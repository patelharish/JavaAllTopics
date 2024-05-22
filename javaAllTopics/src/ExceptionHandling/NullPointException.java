package ExceptionHandling;

public class NullPointException {

	public static void main(String[] args) {
		String str = null;
		
		// System.out.println(str.toUpperCase()); occur NullPointerException
		
		try {
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println("Error: null value can't be casted");
		}
		System.out.println("Another msg");

	}

}
