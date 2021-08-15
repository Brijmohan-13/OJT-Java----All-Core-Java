package June21_NestedClass_NestedInterface;


//static nested class--static inner class
public class Outer {        //class can be default,public,abstract,final
	
	private int age=10;
	static String division="A";
	
	
					//Nested Inner class
					//class Inner is also a member of Outer class
	
	//What is the difference between static inner class and Non static inner class  ??
	//In static nested class, we can write main method in it...whereas in Non-static Nested class we can not wrote main method
	//In static nested class,we can access static variables,methods directly and for Non static variables,methods need to create object/object reference..... whereas for Non static Nested class we can access directly

	
					static class Inner{
						
					 void show()                    // this is non static method even if class is static....like if the class is public,it does not mean that its variables,methods are public
						{
						 		System.out.println(new Outer().age+" "+division);
						}
					 
					 
					 public static void main(String[] args) {
							Inner obj=new Inner();
							
							obj.show();			
						}
					    }//Inner class ends
	 
}//Outer class ends


/*	static void m1()
	{
 		static int age=10;              //in static method,we can not write static variables....since static is class level thing
 	}
 */