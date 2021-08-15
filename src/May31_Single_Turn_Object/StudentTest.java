package May31_Single_Turn_Object;

public class StudentTest {

	
	
	public static void main(String[] args) {
		
		Student s1=Student.getStudent();  // reference is created here
		Student s2=Student.getStudent();  // reference is created here
		
        System.out.println(s1==s2);		
		// s,s1,s2 are pointing to the same object
        //here we have 3 references,1 object
        
	} // main ends
}