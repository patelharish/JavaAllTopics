package StringPrograms;

public class BasicsMethods {

	public static void main(String[] args) {
		// 
		String a = "HKPP";
		String b = "hkp";
		String c = "   Harish   ";
		String d = "";
		// toLowerCase()
		System.out.println(a.toLowerCase());
		// toUpperCase()
		System.out.println(b.toUpperCase());
		// length()
		System.out.println(a.length());
		// concat()
		System.out.println(b.concat(a));
		// trim()
		System.out.println(c.trim());
		// isEmpty()
		System.out.println(d.isEmpty());
		// charAt() return index value
		System.out.println(a.charAt(2));
		// indexof() check index using character
		System.out.println(b.indexOf('p'));
		// equals() 
		System.out.println(a.equals(b));
		// replace character
		System.out.println(a.replace('H', 'R'));
	}

}
