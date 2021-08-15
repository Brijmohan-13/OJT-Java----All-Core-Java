package June03_OOPS;

public class Student {
	
	private int rno,marks;        //since variables are private user can not change the rno, marks directly
	 							  //user can retrieve and update the value by using public getter and setter method only

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		
		this.rno = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if(marks<0)
		{
			System.out.println("Marks can not be negative");
		}
		else
		{
			this.marks = marks;
		}
		}
}
