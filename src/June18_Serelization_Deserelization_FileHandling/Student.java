package June18_Serelization_Deserelization_FileHandling;

import java.io.Serializable;

//Serializable , clonable are unique interfaces having no methods in it....so they are called marker/tagged interfaces

public class Student implements Serializable {

	
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
	
	
	
	
	
}
