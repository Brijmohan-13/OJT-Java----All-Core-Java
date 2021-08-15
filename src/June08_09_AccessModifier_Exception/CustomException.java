package June08_09_AccessModifier_Exception;

//User defined exceptions is also called as Custom Exception
//throw can generate predefined exceptions and User defined exceptions  

public class CustomException {
		
	static void vote(int age) throws AgeNotValid
			{
	                	if (age>18)
	                	{
	                		System.out.println("You can vote.");
	                	}
	                	else
	                	{
	                		throw new AgeNotValid();  //here we can simply print SOP("You can not vote.") but we have generated exception
	                	}
			}
	
	public static void main(String[] args) {
		try
		{
		     vote(25);
		}
		catch(AgeNotValid e)
		{
			System.out.println("You can not vote.");
		}	
}//main ends here
}//CustomException class ends here


//AgeNotValid is User Defined Exception class
class AgeNotValid extends Exception  //AgeNotValid must be child of Exception
{
	
}