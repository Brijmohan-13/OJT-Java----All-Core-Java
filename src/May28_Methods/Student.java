	package May28_Methods;

public class Student {

	int rno;      //global variables,object variables,instance variables;non static variables
	int marks;    //global variables,object variables,instance variables;non static variables
	static String subName="Maths";   //static variable
	
	//int rno,marks is called global variables because the all over class
	//int rno,marks is called object variables because their value depends on object
	
	//Global variables are in blue color
	//local variables are in brown color

		public Student(int rno, int marks) {
		super();      //not required this code....this calls default/non parameterized constructor of object class
		this.rno = rno;
		this.marks = marks;
	}// constructor ends here
	
	@Override   //annotations are nothing but messages from programmer to compiler to JVM to Framework 
		public String toString() {
			return "Student [rno=" + rno + ", marks=" + marks + "]";
		}

//	toString method returns a string representation of the object.
	
}//class ends here
