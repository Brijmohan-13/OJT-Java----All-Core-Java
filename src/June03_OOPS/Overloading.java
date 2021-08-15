package June03_OOPS;

//overloading-method call is bound with method definition at compile time and type of arguments hence compile time poly
//method overloading,compile time polymorphism,static binding,early binding
//occurs in same class
//when method name is same and arguments are different then overloading occurs

public class Overloading {
	
	
	static void add(int a,int b)
	{
		System.out.println("two int arguments");
	}
	
	static void add(int a,int b,int c)
	{
		System.out.println("three int arguments");
	}
	
	
	public static void main(String[] args) {
		
		add(10,20);

		add(50,70,54);

	}

}
//overloading can be done for methods/constructors