package June14_15_16_17_Collection;

import java.util.ArrayList;

public class ArrayList1 {
//	Array can store same type of objects(Homogeneous objects)
//	Arraylist can store mixed type of objects(Heterogeneous objects)
	
public static void main(String[] args) {
	
	//NON-GENERIC Arraylist--we can add heterogeneous objects--Not type safe
	ArrayList al=new ArrayList();		 
	
	al.add(50);
	al.add("JBK");
	 
	String s=(String) al.get(1);	    //  al.get(1)  has return type-object of Object class...so type casting required
	int i=(int) al.get(0);				//  al.get(1)  has return type-object of Object class...so type casting required
	
	
		
	//GENERIC Arraylist--type safe--we can add homogeneous objects___came in JDK-1.5
	ArrayList<String> al2=new ArrayList<String>();		
	
	al2.add("kiran");
	al2.add("om");
    al2.add("piyush");
    
    String s2=al2.get(1);        		 //al2.get(1) has return type as String class object...so no need of type casting
    String s3=al2.get(2);        		 //al2.get(1) has return type as String class object...so no need of type casting


	//compiler knows
    

}




}