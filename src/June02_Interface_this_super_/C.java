package June02_Interface_this_super_;

public class C extends B implements A{

	// Here compiler has confusion (Error)which method is to be inherited from class B or interface A
	//we have written Class C's own public method m1
	
	public void m1()
	{
		System.out.println("Class C method");
	}
	
}
