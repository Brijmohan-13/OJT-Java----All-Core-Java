package June11_Array;

//User defined data type array
//students Array contains objects of Student type 
//static values
public class StudentArray {

public static void main(String[] args) {
	
    Student[] students=new Student[5]; //Students array declared...length must be mentioned...if elements are not added,then default values for type Student array is-null 
	
	students[0]=new Student(11,45);
	students[1]=new Student(12,50);
	students[2]=new Student(13,60);
	students[3]=new Student(14,75);
	students[4]=new Student(15,65);
	
	//students array can be written in another way also
    // Student[] students={new Student(11,45)  ,new Student(12,50) ,new Student(13,60) ,new Student(14,75) ,new Student(15,65)};
//									0					1				   2					3					4				
	
	
	//students is variable (ref. variable) pointing to Student array
	//student is variable (ref. variable) pointing to Student array
	for (Student student:students)
	{
		System.out.println(student);         //since we are printing reference it calls toString method of Student class object
	}
}
}
//for loop can be also used here
//In for loop-SOP will be students[i]
//In for loop-for roll and marks of all students- SOP {students[i].rno} ; SOP {students[i].marks}
//for roll and marks of specific students-SOP {students[3].rno};
