package June14_15_16_17_Collection;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	//duplicates are not allowed
	//Insertion order is maintained/Preserved
	//one null key is allowed and multiple null values are allowed
	
	
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer>    lhm = new LinkedHashMap<String, Integer>();
		
		lhm.put("om", 123);
		lhm.put("swapnil", 4512);
		lhm.put("omkar", 8715);
		lhm.put("dilip", 7789);
		lhm.put(null , 7789);

		System.out.println(lhm);
		System.out.println(lhm.size());

	}
}
