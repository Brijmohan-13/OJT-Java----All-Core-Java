package May27_Char_datatype_Static_Final_Variables_Methods;

public class variables1 {
	
//here we have used static final keywords for variable to make variable as constant
//compiler and JVM are different
//here in place of vaiables1.age compiler puts directly 35......due to static final keywords
//JVM sees directly 35 instead of  variables1.age on line no. 22
//means JVM can not see variables1 word from line number 22....so it will not load variables1 class
//since variables1 class is not loaded in memory....static clock will not get executed.......SO MEMORY IS SAVED HERE
//this is all only when class variables2 is run
//but if class variables1 is run ......static block and other methods from class variables will get executed
	 


	static final int age=35;
static 
{
	System.out.println("I am static block");
}
}

class variables2
{
	public static void main(String[] args) {
	System.out.println(variables1.age);
}
}


