package June03_OOPS;


//Ability to take multiple forms is called as Polymorphism
//only methods can be overridden.There is no concept of Variables Overriding
public class Overriding {
	
/*	overriding-run time polymorphism
	parent child relationship is must
	method signature (method name + arguments) and return type should be same       
	access modifier of parent and child should be same or child class should have greater access modifier
	
	overriding of private methods is not possible
	when the method is child class is static then method hiding occurs and method from parent class is called*/
					
	class A  {
		
		public void m1(int a)
		{
			System.out.println("class A method");
		}
		
		Object m1() //return type is Object 
		{
			return new String ("java");
		}
		
		void m2() throws Exception
		{
			System.out.println("with exception");
		}
	}// class A ends
	
	
	class B extends A {
		
		public void m1(int a)
		{
			System.out.println("class B method");
		}
		
		
		String m1()    //return type is String      //parent k jagah pe child chalta h--this is co-variant return type
		{
			return new String ("python");
		}
		
		void m2() //reverse not possible-
		{
			System.out.println("without exception");
		}
	}//class B ends
	
	
	
	public static void main(String[] args) {
		
	//variable and method which we want to call must be in reference class
		
/*  A obj=new A () ;	
    B obj1=new B ();
    A obj2=new B ();       dynamic binding ...based on whose object is created during runtime it is called as Run time polymorphism`
    B obj3=(B) new A ();*/
//for variables reference is IMP
//for methods object is IMP

}
}//class polymorphism ends
