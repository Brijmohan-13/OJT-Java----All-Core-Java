package June03_OOPS;

//Employee extends Person---is a relation---inheritance(Every inheritance ---   is a relation)
//Student has Phone---has a relation /containment relation---inheritance can not be used here

//object of Student is container object
//object of phone is a contained object
public class Student_ {
	
	int rno;
	Phone phone;
	public Student_(int rno, Phone phone) {
		super();
		this.rno = rno;
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		
		Student_ std=new Student_(15, new Phone(9503,"SAMSUNG"));
		
		System.out.println(std.rno);	
		Phone ph=std.phone;     //phone class object is pointed by reference of Phone class
		System.out.println(ph.phoneNumber+" "+ph.manufacturer );
		
		
		
		
	}
}
