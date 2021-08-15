package June08_09_AccessModifier_Exception;

public class ExceptionDemo {
	
public static void main(String[] args) {

	try
	{
		System.out.println("Hello");
		System.out.println(10/0);
		System.out.println("Hiii");      //it will not get executed since above line generate exception
	}
	catch(Exception e)
	{
		System.out.println("Exception is handled");
	}//first exception handling ends here
		
	try
	{
		Class.forName("String");
	}
	catch(ClassNotFoundException cl)
	{
		cl.printStackTrace();
	}//second exception handling ends here
	
	System.out.println("All is well");
	
}
} 
//finally block-will get executed irrespective of try and catch block
//In general database closed code,file closed code can be written in finally block