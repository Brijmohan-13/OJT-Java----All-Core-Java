package June21_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Notes {
	
	//Reflection is defined as the process of finding out the variables and methods of predefined and user defined class
	//Fields-variables
	//Function-methods
	//Class class has two methods getMethods, getFields()
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fully Qualified name :");
		String cl=sc.next();*/
		
		String cl="June21_Reflection.Student";                 

		Class obj=Class.forName(cl);    								//this gives object of Class class...forClass() requires fully qualified name
//		Class obj=Class.forName("June21_Reflection.Student");           //also this can be written
		
		
		for (Field field : obj.getFields())     //Field is Type 
										    	//obj.getFields()  returns Field [].....public fields...also inherited fields
		{
			System.out.println(field);
		}
		
		for (Method method : obj.getMethods())   //Method is Type 
												//obj.getMethods()  returns Method []...both declared methods in Student class & Inherited methods
		{
			System.out.println(method);
		}
		
		for(Field field  :obj.getDeclaredFields())        //getDeclaredFields() returns Field[]...fields with any access modifier...but will not give inherited fields
		{
			System.out.println(field);
		}
		
		for(Method method : obj.getDeclaredMethods())  //getDeclaredMethods() returns Method[] which are declared in Student class...will not give inherited methods
		{
			System.out.println(method);
		}
	}

}//class ends


class Student{

	int rno,marks;

	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
}//class ends

//Compile time part		  Run time part
//Compiler					JVM
//Compilation				Execution
//   Student std   =   new Student();
