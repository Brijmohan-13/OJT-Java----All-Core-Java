package June14_15_16_17_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapEx {
	
	//HashMap is used for Pair of Objects
	//Every Key is Object----Key is Unique---New Key is has preference
	//Every Value is Object
	//Every Entry Set is Object
	
	//HashMap do not implement collection interface
	//Duplicates are not allowed........value can be duplicate
	//Random Printing
	//HashMap allows only one null key and multiple null values
	
	public static void main(String[] args) {
		HashMap<String, Long>  hm=new HashMap<String, Long>();
		
			// 	Key      Value
		
		hm.put("swapnil", 123445l);     //-------> Entry Object 1
		hm.put("om", 	456798l);		//-------> Entry Object 2
		hm.put("omkar", 456798l);		//-------> Entry Object 3
		hm.put("mayur", 564911l);		//-------> Entry Object 4
		hm.put("mayur", 888l);			//-------> Entry Object 5
		
		System.out.println(hm);
		System.out.println(hm.size());
				
		Long phone=hm.get("om");             //key passed to get value
		System.out.println(phone);

		Long phone1=hm.get("shiv");             //key passed to get value
		System.out.println(phone1);
		
		hm.remove("swapnil") ; 
		System.out.println(hm);
		
		
		//KeySet() gives all Key Objects of hashmap...hm.get() also gives key but single key
		
		   Set <String> keys= hm.keySet();			// [om] [omkar] [mayur]
						  //= Set Object
			
			System.out.println("All values from keyset are");

			for(String key :keys)
			{
				System.out.println("Key : "+key+","+" Value : "+hm.get(key) );
			}	
			
			System.out.println("Iterating key objects==========================");
			// Iterator reference will point to iterator object = gives iterator object for all keys(Iteartor object is required to use its methods)
								   Iterator <String> it = keys.iterator();      // [omkar]  [om]  [mayur]
						
								   while(it.hasNext())
								   {
									  String st= it.next();
									  
									  System.out.println("Value of key "+st+" is "+hm.get(st));
									  System.out.println("length of String :"+st.length());
									  System.out.println("Second Character of key is "+st.charAt(1));
								   }
				
								   
			System.out.println("Hashmap Entry objects=======================");	
			Set <java.util.Map.Entry<String, Long>> entrysets =hm.entrySet();       //this gives set of all Entry objects
			
			System.out.println(entrysets);
			
			for(java.util.Map.Entry<String , Long> entryset : entrysets)
			{
				System.out.println("Value of key :"+entryset.getKey()+" is "+entryset.getValue());
			}
			
			
			
			System.out.println("Iterating Entry objects");
			
									Iterator <java.util.Map.Entry<String ,Long>> its=entrysets.iterator();        //gives iterator object for Entry
						while(its.hasNext())		
						{
							java.util.Map.Entry <String , Long> en=its.next();
							System.out.println("key is "+en.getKey()+" & "+"value is "+en.getValue());
							
						}
															
								   
}
}//CRUD-----Create,Read,Update,Delete
//Entry is interface
//long -primitive objects
//Long-Wrapper Objects

//In Map,Set is obtained for both Key objects and Entry objects
//for each loop is preferred over Iterator           (both are IMP)

