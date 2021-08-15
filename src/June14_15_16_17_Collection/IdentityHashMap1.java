package June14_15_16_17_Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap1 {
	
public static void main(String[] args) {
	Integer i1=new Integer(10);				//i1 reference stores address [1000] in it
	Integer i2=new Integer(10);				//i2 reference stores address [2000] in it
											//i1 and i2 have same content 

	IdentityHashMap<Integer, String>  id=new IdentityHashMap<Integer, String>();
	id.put(i1, "Hii");
	id.put(i2, "hello");
	
	System.out.println(id);
	System.out.println(id.size());
	
	//but see for Hashmap
	HashMap<Integer, String>  hm=new HashMap<Integer, String>();
	hm.put(i1, "Hii");
	hm.put(i2, "hello");
	
	System.out.println(hm);
	System.out.println(hm.size());


}
}