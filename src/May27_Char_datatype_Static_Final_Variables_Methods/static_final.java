package May27_Char_datatype_Static_Final_Variables_Methods;

public class static_final 
{

//static variable will get initialized during CLASS loading
//static variable,static method  is the CLASS level thing
//static variable,static method does not dependency on object
	
	
//static block,static variable

	int a;   // global variable
	static int b;  // global variable
	
	 
	void m1()
	{
		int c;   //local variable
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(new static_final().a );
		System.out.println(new static_final().b );
		System.out.println(static_final.b );
		System.out.println(b);    ///inside the class directly

    }
	
	
}
