package June14_15_16_17_Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Integer_Comparator {
	
  /*When Integer class objects are added in treeSet,then they are sorted in ascending order(Natural Sorting)
	Integer Wrapper Class has already implemented comparable interface in it and compareTo() is defined for ascending order
	We can not change the predefined classes as they are not accessible
	If we want to wrapper class objects in descending order then we go for Comparator interface in new class
 */

	public static void main(String[] args) {
		
		TreeSet<Integer>  ts=new TreeSet<Integer>(new sort());     //we have to do against to Natural sorting...so object of our sort class is passed
		
		ts.add(10);
		ts.add(15);
		ts.add(1);
		ts.add(50);
		
		System.out.println(ts);
		System.out.println(ts.size());
		}	//main ends
}//class ends


class sort implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		
		if(i1>i2)
			return -1;
		else if (i1<i2)
			return 1;
		else
			return 0;
	}
	
}
