package CollectionsInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
       HashSet<Integer> hs = new HashSet<Integer>();
       hs.add(99);
       hs.add(76);
       hs.add(45);
       hs.add(34);
       System.out.println(hs);
       
       // Iterator : It is iterate(points) each value of set by starting of index first
       
       Iterator<Integer> i = hs.iterator();	
       System.out.println(i.next());
       System.out.println(i.next());
       System.out.println(i.next());
       System.out.println(i.next());
       
       // lets suppose we have 100 of index so we need to print every i.next() : No --- in this case we using loops
       Iterator<Integer> j = hs.iterator();
       System.out.println("Priting by using while loop");
       while(j.hasNext()) {
    	   System.out.println(j.next());
       }
	}
}
