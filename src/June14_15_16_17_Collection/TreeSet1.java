package June14_15_16_17_Collection;

import java.util.TreeSet;

// Duplicates not allowed
// Elements are sorted 
public class TreeSet1 {
	
	
	public static void main(String[] args) {
		
		TreeSet<Integer>  ts=new TreeSet<Integer> ();

		ts.add(10);
		ts.add(20);
		ts.add(1);
		ts.add(5);
		ts.add(10);
		ts.add(5);
//		ts.add(null);         gives null pointer exception since it has to sort elements
		
		
		
		
		System.out.println(ts);
		System.out.println(ts.size());
	}

}
