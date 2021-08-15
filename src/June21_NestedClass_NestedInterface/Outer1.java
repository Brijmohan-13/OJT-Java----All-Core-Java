package June21_NestedClass_NestedInterface;

//Non static Nested class
public class Outer1 {        //class can be default,public,abstract,final
	
	private int age=10;
	static String division="A";
	
	
					//Non static Nested class
					//class Inner is also a member of Outer class
					 class Inner1{
						
					 void show()                    
						{
						 		System.out.println(age+" "+division);
						}
					    }//Inner class ends
					
					
					 
					 //main method is outside Non static Nested class
					public static void main(String[] args) {
						Outer1 out=new Outer1();           //**********
						Outer1.Inner1 in=out.new Inner1(); //********
						in.show();					
					}//main ends
}//Outer class ends
