package June08_09_AccessModifier_Exception;

public class throws_ {
	
	
	static void findclass() throws ClassNotFoundException        //delegates responsibility of exception handling to main method
	{
		Class.forName("String");
	}
	
	public static void main(String[] args)  throws ClassNotFoundException   //delegates responsibility of exception handling to JVM
	{	
		findclass();
	}
	
	//Exception occurs here but not handled
}
