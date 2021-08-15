package June22_FactoryDesignPattern;

import java.util.Scanner;

public class Test {
		
	static ElectricityPlan getObject(String planType)
	{
		if(planType.equals("domestic"))
			return new DomesticPlan();
		
		else if(planType.equals("commercial"))
				return new CommercialPlan();
		
		else
			return null;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter plan type");
		String planType=sc.next();
		
		//Here we are not creating object...we are getting object
		//getObject() returns object based on user input
		//Reference of ElectricityPlan is pointing to object of its implementing class(object depends on user input)
		//Then respective methods from DomesticPlan/CommercialPlan object are called
		ElectricityPlan obj=getObject(planType);
		obj.setRate();
		obj.calculateBill(45);
		
		
		
		
	}

}
