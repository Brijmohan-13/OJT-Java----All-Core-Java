package June03_OOPS;

public class StudentTest {
	
	public static void main(String[] args) {
		Student obj=new Student();
		
		System.out.println(obj.getRno()+" "+obj.getMarks());
		obj.setMarks(-15);   
		obj.setMarks(15);


	}
	}
