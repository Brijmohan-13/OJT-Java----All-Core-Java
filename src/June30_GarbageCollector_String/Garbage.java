package June30_GarbageCollector_String;

public class Garbage {

	
/*  Garbage collection is not in programer's hand
	we can request for Garbage collection not force
	
	If the object is not pointed by any reference then the object is eligible for Garbage Collection...then it sure that object will be destroyed
	Garbage collector will destroy the object so that other object can be stored at that memory location
	After Garbage collector destroys object finalize() would be called
	Use of finalize Method-before the object gets destroyed if we want execute some code then we can write that code in it
	There is no guarantee that finalize() would get executed 
	
	
	************Difference final keyword,finally Block,finalize Method
	final is a keyword used for constant,class,method
	finally block will get executed Everytime irrespective exception occurrence
	finalize method is called when garbage collector is about to destroy the object
	
	*/
 }



class A{
	
	public static void main(String[] args) {
		
		A obj=new A();					//here obj stores address in it
		
		//Object Reference points the object also Object Reference is used to call the variables,methods from the object
		
		
		obj=null;				//here obj stores null in it...object is not pointed by object reference
								//this means class A is eligible for Garbage Collection
		
		System.gc();			//this invokes/calls calling garbage collection method;......not necessary to write this method...just a suggestion to JVM
								//also we need not to call finalize();  it will be called automatically...we can define also this method
		
		
		
	}
}
