package June30_GarbageCollector_String;

public class StringEx {

	//String is a class
	//String is a constant(i.e. final class-we can not create its child)....object is constant here not reference
	//String is Immutable (String class object is Unchangeable)
	//String is the only class where without using constructor we can create object
	
	
	public static void main(String[] args) {
		
		String s1="java";					//java is String class object----->approach 1			recommended (1 object is created)
		String s2=new String("JDBC");		//JDBC is String class object----->approach 2			not recommended (2 objects are created)
		String s= new String();			    //empty String...not recommended...not needed
		
		
		String s3="hello";		//one object in SCP
		String s4="hello";		//no new object...s3,s4 are pointing to same object...SCP does not duplicate objects
		String s5=new String("hello");		//two objects should be created...but only one will get created in heap...whereas in SCP already there is object with content"hello"
		String s6=new String("hello");		//two objects should be created...but only one will get created in heap...whereas in SCP already there is object with content"hello"
		
		System.out.println(s3==s4);			
		System.out.println(s5==s6);		   //s5,s6 are pointing to different objects in heap 
		
		
		String s7="MY";			//MY is object
		System.out.println(s7);		
		s7=s7.concat("SQL");	//MYSQL is new object...String does not update existing object
		System.out.println(s7);		
		
		int a="JBK".length();					//"JBK" is also String class object(anonymous)
		System.out.println(a);
	
	}	
}
//reference stores address in it,reference points to object,we call content from object using reference