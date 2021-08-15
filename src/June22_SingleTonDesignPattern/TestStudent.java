package June22_SingleTonDesignPattern;

public class TestStudent {
	
	public static void main(String[] args) {
		
//		REFERENCE    = OBJECT
		Student obj1 = Student.getStudent();     //reference obj1 will point to object
												 //Now, since obj has some address in it not null...so new object is not created
		
		Student obj2 = Student.getStudent();     //reference obj2 will point to same object
											  //obj,obj1,obj2 are pointing to same object....this saves Memory
		
		System.out.println(obj1==obj2);     //since it returns true both are pointing to same object
			
	}
}
