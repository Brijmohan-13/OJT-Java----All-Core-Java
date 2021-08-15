package June14_15_16_17_Collection;

import java.util.HashMap;
import java.util.HashSet;

public class EqualsHashcode_Hashmap {
		
	public static void main(String[] args) {
		
		HashMap<Student1,Integer>   hm=new HashMap<>();
		
		Student1 s1=new Student1(1, 55);        //hashcode for s1,s2,s3 is different
		Student1 s2=new Student1(2, 70);
		Student1 s3=new Student1(1, 55);
		
		hm.put(s1,1);
		hm.put(s2,2);
		hm.put(s3,3);
		System.out.println(hm);
}//main ends
}//class ends


class Student1{

	int rno,marks;
	
	public Student1(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [rno=" + rno + ", marks=" + marks + "]";
	}

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
		Student1 other = (Student1) obj;
		if (marks != other.marks)
			return false;
		if (rno != other.rno)
			return false;
		return true;
	}


	
	//add equals() and hashcode() method.....right click-source-generate equals() and hashcode()
	
	}//class student ends