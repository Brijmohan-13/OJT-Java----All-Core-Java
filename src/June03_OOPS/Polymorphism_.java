package June03_OOPS;


//In place object of parent class we can write Object of child class
//In argument, parent object k jagay pe child object ---example collection-Arraylist methods
public class Polymorphism_ {
	
	static void m1(Object o)
	{
		System.out.println("Argument as object of Object class");
	}
	
	
	
	public static void main(String[] args) {
		
		m1(new String("JBK"));        //object of String class
		
		
	}

}
