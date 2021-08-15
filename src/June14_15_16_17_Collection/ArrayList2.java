package June14_15_16_17_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayList2 {
	
	//remove the duplicates from arraylist & maintain insertion order
	//remove the duplicates from arraylist & random printing
	//sort the elements of arraylist
	
	
public static void main(String[] args) {
	
	
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(10);
	al.add(20);
	al.add(10);
	al.add(5);
	
	System.out.println(al);
	
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>(al);
	System.out.println(lh);
	
	HashSet<Integer> hs=new HashSet<Integer>(al);
	System.out.println(hs);
	
	TreeSet<Integer> ts=new TreeSet<Integer>(al);
	System.out.println(ts);
}	
}
