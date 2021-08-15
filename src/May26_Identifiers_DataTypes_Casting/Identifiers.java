package May26_Identifiers_DataTypes_Casting;

public class Identifiers

{
		//Identifiers are
		//Class Name
		//Variable Name
		//Method Name

	int age1=10;    //allowed
//not allowed    int 1age=10;

	
	public static void main(String[] args) 
	{
		int System=10;     //here identifier is System.System is predefined class of java.
		                   //The word "System" can be used as a Identifier but it is preferred since it reduces code readability
		java.lang.System.out.println(System);
	}


//***NAMING CONVENTIONS RULES***
//Identifiers should not start with digits.Digits can be used in between or at the end...public class LogInTEST111
//Keywords are not allowed as identifier
// int static=10;   not allowed 
//int final=10;      not allowed
//Magenta colored words are keywords
//allowed identifier characters are a-z,A-Z,0-9,_,$
// variable name,method name should begin with Lowercase
// class name,interface name should begin with Uppercase
    //  int myAge=10;
    //  public void logInTest(){};
    //  public class LogInClass;
	//GENERAL---methods are used to define some operation--add,substract 
	//method name should be meaningful
//In java memory allocation is dynamic i.e. memory allocation is done during  Run time	

	
	
	// RULE ->public class name and file name should be same= (see notebook notes)
	//one java file can have only one public class 
	//but can have multiple classes
	
	//overriddng of static method is not possible but static method can be inherited
	//When there are multiple classes in one public class then to run particular class....Run>Run Configuration>Main Class
	//JVM calls main method
	
	
	
	
	
	
	
	
	
	
	
	
}// main ends 
