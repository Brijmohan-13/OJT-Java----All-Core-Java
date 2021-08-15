package June08_09_AccessModifier_Exception;

public class Notes {

		
	//whenever any method has return type as object then we need to do type casting
	//if any method has interface as return type then it returns object of implementing class
    //if we give reference of any class/interface then we can call only those variables / methods which are in reference (methods k liye object IMP h but reference mein vo method chahiye)	
/*
 Types of access modifier-
	default-within the package
	private-within the class
	public-within the project
	protected-within the package & in child class (object and reference should be of child class only)
	
	
	Parent p=new Child();    -----possible
	Child c=(Child)new parent();      ----possible with type casting*/
	
	
	/*-------------------------------------------------------------------------------------------------------------
	If we want to extend a class which is in another class it will get imported automatically above class name
	We can extends in another way also...by mentioning FULLY QUALIFIED NAME(it is preferred )
	like Class A extends com.p4 
	
	examples-
    TestNG XML files---import statement can not be written in XML file---fully qualified name is must here
	This is useful in case of Date class which is present in java.util and java.sql package--fully qualified name is must here
	Class.forName("java.lang.String");
	
		
    Writing import statement for classes from Packages is not mandatory-
    java.util
    java.lang
    java.IO
    java.sql
    
    
    *System.exit();           used to terminate the program(ex. in switch case)
    */
	}
