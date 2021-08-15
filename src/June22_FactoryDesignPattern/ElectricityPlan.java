package June22_FactoryDesignPattern;

//Factory Design Pattern-Abstract Factory
public abstract class ElectricityPlan {
	
	
	int rate;
	
	abstract void setRate();    //this method is not defined here....its implementation would be different in child classes i.e. rates would be different in child classes 
	
	void calculateBill(int units)
	{
		int bill=rate*units;
		System.out.println("Electricity bill is "+bill+" Rs.");
	}
}

//Wrapper class is like Box
//Wrapper class contains primitive
//Wrapper class object contains primitive value
