package June14_15_16_17_Collection;

import java.util.HashSet;

public class EqualsHashcode_Hashset {
	
	/*
	Equals() is used to check whether two objects have same content or no
	If Equal() returns true, hashCode() will make hashcode of those objects same 
	so we have to override both methods
	Then,if two objects have same hashcode then it will not add the second object(only one object will get added)
	
	If Equals(),Hashcode() are not overridden then both objects s1,s3 will get added*****
	
	these two methods are used in hashset and hashmap
	these methods have no relation with treeset and treemap
    */	
	
	public static void main(String[] args) {
		
//		compile time part			run time part
//		here we are informing compiler that we will add only Student class objects
		HashSet<Student>  hs   =    new HashSet<Student>();
		
		Student s1=new Student(1, 55);        //hashcode for s1,s2,s3 is different
		Student s2=new Student(2, 70);
		Student s3=new Student(1, 55);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs);
}//main ends
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
	
	//add equals() and hashcode() method.....right click-source-generate equals() and hashcode()
	//no need to understand this code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + rno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (marks != other.marks)
			return false;
		if (rno != other.rno)
			return false;
		return true;
	}
	
	
	}//class student ends