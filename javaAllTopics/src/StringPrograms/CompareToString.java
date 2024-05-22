package StringPrograms;

public class CompareToString {

	public static void main(String[] args) {
		String a = "harish"; // String literal
		String b = "harish"; // String literal
		String c = new String("harish"); // new keyword
		if(a==b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
        
		if(a.equals(c)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
