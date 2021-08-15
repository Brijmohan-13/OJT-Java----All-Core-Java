package June03_OOPS;

public class Inheritance {
	
//  Simple inheritance
//	multilevel inheritance
	class A{}
	
	class B extends A{}
	
	class C extends B{}
	
	
	
	
	/*  Multiple Inheritance is not possible in java in Class approach
		class P{}
    	class Q{}
		class R extends P,Q,R {}       */ 
		
//		Multiple Inheritance is possible in java in interface approach
		interface P{}
		interface Q{}
		interface R{}
		class T {}
		interface U extends P,Q,R{}
		class S  implements P,Q,R {}
		class V extends T  implements P,Q,R {}          //if class T and any interface P,Q,R contains method with same signature then it gives compile time error

		
		
		
	
	
	
	
	
	
	
		
	
	
	
	

}
