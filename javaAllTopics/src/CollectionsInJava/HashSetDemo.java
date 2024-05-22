package CollectionsInJava;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// HashSet, TreeSet,LinkedHashSet : implementing Set interface
		// It doesn't accepts duplicate values 
		// there is no gaurantee to store elements in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Harish");
		hs.add("Harish");
		hs.add("Anuj");
		hs.add("Dharni");
		hs.add("aswini");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove("aswini");
		System.out.println(hs);

	}

}
