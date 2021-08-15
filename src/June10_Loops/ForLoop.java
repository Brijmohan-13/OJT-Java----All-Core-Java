package June10_Loops;

//initialization,condition check,increment/decrement are in single line so it is more popular

public class ForLoop {
	
	public static void main(String[] args) {
		
		for (int i=1 ;i<=5  ;i++)
			
		{
		    System.out.println("java is easy");	
		} // loop body ends
		  // i is called as loop variable
		
		
		   int i=1;            // semicolon ends sentence
         for (i=1 ;i<=5  ;i++)        //if semicolon is written here then 'below block & for' are different statement 
		{
		    System.out.println("java is very easy");	
		}
		
         
         
         
         int count=0;
         for (  ;true ; )
		{
		    System.out.println("----selenium is easy----");
		    count++;
		    
		    if(count>3)
		    	break;
		}
         /*IIB--instant initialization block -used to instantiate instance variables or to print...this block will get executed during object creation
		it will get executed every time when the object is created 
   		they are used if we want to run some code regardless of which constructor is used
   {
   	SOP{};
   	 int i=15; 
   }
         
         
   static                                     //static block
   {
    	 //it is a class level block
   }*/
        
	}
}
