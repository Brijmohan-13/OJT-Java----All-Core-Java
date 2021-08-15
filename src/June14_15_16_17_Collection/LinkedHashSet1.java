package June14_15_16_17_Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	//Duplicates are not allowed
	//Insertion order is preserved/maintained
	
	
	public static void main(String[] args) {
		
		
		
		LinkedHashSet<Integer>   lhs =new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(10);
		lhs.add(1);
		lhs.add(50);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
	}
	}
