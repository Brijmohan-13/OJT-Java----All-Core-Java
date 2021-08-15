package May31_Single_Turn_Object;

public class Student {
	
	//SINGLE TURN OBJECT program
	//*****making constructor private so that object can be created in Student class only
	//*****but object creation is IMP to access Student Class...so we are creating getStudent(); which returns Students class object
    //example of single turn class---Calendar class by java
	
	
	int rno;
	int marks;
	
	static Student s;
	
		private Student()
	{      }
	
	
	static Student getStudent()
	{
		if(s==null)       //if condition is not written here multiple objects can be created
			s=new Student();
			return s; ///object is created here
	}
	}
