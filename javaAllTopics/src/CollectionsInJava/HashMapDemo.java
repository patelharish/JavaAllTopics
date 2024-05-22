package CollectionsInJava;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// In HashMap: we map Key and Value pair
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Ram");
		hm.put(1, "Shyam");
		hm.put(2, "Lakhan");
		hm.put(3, "Bharat");
		hm.put(43,"Hari");
		System.out.println(hm);
		System.out.println(hm.get(43));
		System.out.println(hm.get(55));
		hm.remove(43);
		System.out.println(hm);

	}

}
