package CollectionsInJava;

import java.util.ArrayList;

public class ArrayListDemo {
	// arrayList,LinkedList,vector - implements List interface
   // array have fixed size and arraylist grow dynamically(you can insert value any of index)
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Harish");
		a.add("Anuj");
		a.add("Dharni");
		System.out.println(a);
		a.add(0, "Ram");
		System.out.println(a);
		a.get(0);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		a.remove(0);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		System.out.println("\nInteger Arraylist---------\n");
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(80);
		b.add(50);
		System.out.println(b);
		b.sort(null);
		System.out.println(b);
		System.out.println(b.contains(50));
		System.out.println(b.contains(90));
		System.out.println(b.indexOf(50));
		System.out.println(b.isEmpty());
		
		// Can accepts duplicate values 
		
		b.add(50);
		System.out.println(b);
		b.sort(null);
		System.out.println(b);
	
		
	}

}
