package June22_SingleTonDesignPattern;

//If only one object can be created for the class then the class is called --Single Ton Design Pattern
//Example-Driver class in JDBC is single Ton class

//Types of Design Patterns
//Single Ton Design Pattern
//Factory Design Pattern

public class Student {
	
	int rno,marks;
	static Student obj;
	

	private Student() {     //private constructor
	}

		
	static Student getStudent()       //getStudent() returns Student Type object
	{
		if(obj==null)
			obj=new Student();       //obj will point to Student Type object
			return obj;
	}
}
