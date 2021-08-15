package June14_15_16_17_Collection;

public class Student_Comparable implements Comparable<Student_Comparable> {
	
	int rno,marks;

	public Student_Comparable(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
		}
	
	@Override
	public String toString() {
		return "Student_Comparable [rno=" + rno + ", marks=" + marks + "]";
	}

	
	// -3  -2  -1  0  1  2  3
	@Override                         //sorting based on rno
	public int compareTo(Student_Comparable s) {
		
		if(rno>s.rno)
			return  1;        //this gives ascending order....if we want descending order then change signs
		else if(rno<s.rno)
			return -1;
		else
			return 0;             //if both rno are same then second element is not allowed....takes only first element
								 //if return 2; is written on line 29 then both rno are taken
	}
	
	
	//Only one Sorting sequence can be achieved with comparable interface*********
	//if sorting is to be done based on marks and rno then we have to use comparator
	//create sort class--implement comparator interface--define compare()--pass this sort class object in constructor of treesSet
	
	
	}
