package May27_Char_datatype_Static_Final_Variables_Methods;

public class variables
{
	//variables are the containers where some value is stored
    //variables are called variables since its value keeps on changing
	//local variables are not initialized by JVM
	//local variables have only one modifier applicable i.e. final
	//static and non-static veriables are initialized by JVM
	//static block will get executed during Class loading(class loading in Memory)
	//static block will get executed before main method
	//static block will can be executed without main method before JDK 1.7 not in JDK 1.7,1.8
		int age=20;  
		static int ageOfBoy=35;

		
				
		static 
		{
			System.out.println("Static block executed First of all");
		}
	
	public static void main(String[] args) {
	 
	System.out.println(new variables().age);      // new is must here.......new variables().age is anonymous object
	System.out.println(new variables().ageOfBoy);       //with new
	System.out.println(variables.ageOfBoy);       //without new
	System.out.println(ageOfBoy);       //directly within class



	
	//main mathod is the static context...we can not call non static context in static block
	//since age is non static we need to create object of the class.
	//or else we can write as new variables().age	
}
}
