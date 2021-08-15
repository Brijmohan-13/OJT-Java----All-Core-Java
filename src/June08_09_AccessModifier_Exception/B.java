package June08_09_AccessModifier_Exception;

//here in class B m1() can accessed normally 
public class B {
	
public static void main(String[] args) {
	
	new A().m1();   //m1() of Class A can be called here..it is protected method accessible since it is in same package



}
}

/*
=====================================================
Consider that Class C is in another package
To access protected method m1() :
      Then protected method is accessible in child class only
      Also reference and object should be created for child class only
      Here m1() from C overrides m1() from A....or if m1() is not in C then m1() is called from A
 
public class C extends A {
	
	
	protected void m1()
	{
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		C obj=new C();
		obj.m1();
		
	}
	}*/