package June02_Interface_this_super_;

public interface Remote {
	
	
	void on();  //abstract method
	void off(); //Abstract method
	
	
	
	
	//****Why we can not create object of Interface/Abstract Class?
	//Interface does not have constructor so...
	//Abstract class have constructor but still we can not create its object..because abstract methods are not defined there.
	
	//****Why multiple inheritance is not possible for class and possible for interface ?
	//one class can extend only one class****Rule
	//Class A extends B,C            (B,C are class)****this is not possible
	//Because there will be compiler confusion/Ambiguity Error which class's method is to inherit(if both class have same method)
	
	
	
	//one interface can have multiple implementing classes
	//one class can implement multiple interfaces 
	//interface A implements B,C    ****this is possible  (B,C are interfaces)---(if any method signature is same for both interfaces B,C and return type is different----then it will compile time error)

	//Method Signature= method name + arguments
	
}