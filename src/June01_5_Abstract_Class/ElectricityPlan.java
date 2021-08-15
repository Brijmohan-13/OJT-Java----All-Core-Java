package June01_5_Abstract_Class;


//****Why Abstract class is used/created ?
//when we don't want to create object of our class
//Abstract class has abstract methods. when these methods are to be defined in its own way in child classes..then we go for Abstract class

//*****Abstract Class example for interview
//here CommercialPlan and DomesticPlan extends abstract class ElectricityPlan
//abstract methods must be implemented in child classes(must be defined)
//concrete methods definition is not req. to be written in child class
//**Abstract class and interface does not allow to make object of it
//but in abstract class, variables are initialized by calling constructor

//Execution flow---
//Memory is allocated with new word & CommercialPlan class constructor is called
//Constructor construct the object
//ConstructorPlan Constructor calls parent class constructor(super())(since constructor calling is first statement of every Constructor)
//so Abstract class Constructor is called..its variables are initialized
//then child  class variables are initialized

//If reference & object are of same class......own words
//Here, parent class's reference is given and object is created for child class
//so while calling variables ----Reference is IMP
//so while calling methods ----object is IMP

//ElectricityPlan-parent
//CommercialPlan-child
//DomesticPlan-child
//TestElectricity-

//abstract class variables are initialized by calling constructor
// interface does not have constructor ...variables are public static final
public abstract class ElectricityPlan {
	int rate;
	
	abstract void setRate();
	
	void calculateRate(int units)
	{
		System.out.println(rate*units);
	}
	}
