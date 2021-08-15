package June08_09_AccessModifier_Exception;

public class MultipleCatchBlocks {

	/*Whenever exception occurs , object gets created for the child class of Exception class
	Parent class reference can certainly point to object of child class     *****
	Exception class reference can certainly point to object of its child classes

	(Throwable---->Exception---->Exception child classes)
	
	//	Why multiple catch blocks are written
	//  To give specific messages in catch block that which exception has occurred
	*/
	public static void main(String[] args) {
		try
		{
			Class.forName("String");	//this line may generate ClassNotFoundException and create object of it
			System.out.println(10/0);   //this line may generate Arithmetic exception and create object of it
			System.out.println(args[5]); //this line may generate ArrayIndexOutOfBoundsException and create object of it
			System.out.println("Hiiii");
		}
		
		//()here it is like overloading...whoever's argument matches, that catch block will get executed and at last we have written Exception class reference where all arguments can fit 
		
		catch(ClassNotFoundException cl)
		{
			System.out.println("Please enter fully qualified name of class");
			cl.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Please divide with right number");
			aiob.printStackTrace();
		}
		catch(ArithmeticException ari)
		{
			System.out.println("Please use correct index");
			ari.printStackTrace();
		}
		catch(Exception ex)   	//Parent class reference can certainly point to object of child class*****

		{
			System.out.println("Exception occured");
			ex.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


//local variables must be initialized...
//compiler is like assistant of JVM