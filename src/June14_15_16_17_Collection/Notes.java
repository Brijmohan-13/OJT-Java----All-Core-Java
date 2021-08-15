package June14_15_16_17_Collection;

import java.util.ArrayList;
public class Notes {
	
	//refer notes from Notebook
	//Array is a fixed size container(we store elements-primitive type values,objects)
	//Collection is NOT the fixed size container     (online shopping example)
	//Collection Framework is not for primitive data types.It is for Objects******
			
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList <Integer>();
//		ArrayList<E>---- E means Entity/type/class
		
		al.add(10);      
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);        //to add element

		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(0));		//index passed-to get element
		
		al.set(5, 100);      //index passed-to update element---to update
		System.out.println(al.get(5));
		
		al.remove(3);                    //index passed-to delete element     remove method is overloaded method
		al.remove(new Integer(10));		 //object passed-to delete element
		System.out.println(al);
		
		
//		Adding primitive value elements into collection is BOXING
		
//		Integer primitive values are converted into integer class objects is AUTOBOXING
		

//In call by value,copy of variables is passed
//In call by value,Actual & formal arguments will be created in different memory location	
//In call by reference,variables itself is passed
//In call by reference,Actual & formal arguments will be created in same memory locations
		
		
		
//performance of Array is better than Arraylist
//we can do project without using collection by using Array
		
//java.lang.comparable
//java.util.comparator
}
}
