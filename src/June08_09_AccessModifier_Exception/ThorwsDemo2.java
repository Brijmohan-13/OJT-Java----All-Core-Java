package June08_09_AccessModifier_Exception;

public class ThorwsDemo2 {

	
	
	static void m1() throws NumberFormatException , ClassNotFoundException
	{		
			Class.forName("java.lang.String");
			Integer.parseInt("10");
	}
	
	static void m2() throws NumberFormatException, ClassNotFoundException 
	{
		try
		{		
			m1();
		}
		catch(	NumberFormatException | ClassNotFoundException ee)
	    {
			ee.printStackTrace();
	    }
		
		//throw d;  ....this code again generate exception
	}
	
	public static void main(String[] args) throws Exception {
				
				
					m2();
						
					
			System.out.println("All is  well");
		
	}
}
