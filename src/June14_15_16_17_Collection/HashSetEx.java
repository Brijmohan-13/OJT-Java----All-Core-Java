package June14_15_16_17_Collection;

//example online exam
import java.util.HashSet;  


// Duplicates not allowed
// Random printing/
public class HashSetEx {
	public static void main(String[] args) {
		
		
		
		
		HashSet<String> hs=new  HashSet<String>();
		HashSet hs2=new  HashSet();
		
		hs2.add(10);
		hs2.add("kiran");


		
		hs.add("jbk");
		hs.add("abc");
		hs.add("ppp");
		hs.add("xyz");
		hs.add("uuu");
		hs.add("ppp");
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		
		
		//Collections interface has following methods which are extended by Interface List & Set and implemented by their classes
		
		//al.add();      implementation of add() is different in different classes *********** (interface example for interview+remote TV example )
		//al.get();
		//al.set();
		//al.remove();
		
		
		//.class file for predefined classes and Interfaces 
	}
	
	

}
