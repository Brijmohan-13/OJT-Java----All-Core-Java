package June14_15_16_17_Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet3 {
	
	//In treeSet,if there are Integer class objects then sorting is done in ascending way...as it is internally defined in Integer class
	
	//but if want elements in descending order then HOW ???
	
	
public static void main(String[] args) {
	
	TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			if(o1>o2)
				return -1;
			else if (o1<o2)
				return 1;
			else
			return 0;
		}
	});
	
	ts.add(10);
	ts.add(20);
	ts.add(5);
	ts.add(1);
	
	System.out.println(ts);
	
}	
	//comparator interface is implemented when sorting of objects is required whose class is not accessible(ex. Integer Class )
	
	//collection has only Objects
	//primitive value gets converted into wrapper class objects 
    //User defined type objects..student.employee,account

	//? is ternary operator
}
