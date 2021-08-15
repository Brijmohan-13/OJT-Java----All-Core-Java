package May28_Methods;

public class StudentTest {

	int a=15;  //primitive variables....variables which stores primitive values in it are primitive variables
	int b=25;  //primitive variables....variables which stores primitive values in it are primitive variables
	
	public static void main(String[] args) {
		Student abhijit;  //object is nothing but instance of class
		Student vaibhav;  //object is nothing but instance of class
		 		  
		abhijit =new Student(5,70); //data type of abhijit is Student(user defined data type)
		vaibhav =new Student(8,85); //data type of vaibhav is Student(user defined data type)
		
		System.out.println(abhijit);
		System.out.println(vaibhav);
		System.out.println(new Student(1,60));    //anonymous object also calls toString method of student class 
		
		//abhijit,vaibhav are called as Object name,reference variable,reference,object reference variable,object reference,pointer variables
		//reference stores address in it
		//abhijit(1000)===>reference points to Student class object at address 1000		
		//data/values are stored at this address
		}
	
	//EXECUITON FLOW
	//JVM runs main method
	//object creation at the same time constructor calling of student class 
	//In student class constructor global variables are initialized ()
	
	//hashcode and memory address are different
	//When the reference variables abhijit,vaibhav are printed then it calls toString method of Student class...and it prints values in it
	//When toString method is not written in the Student class then it calls toString method of the object class....and it prints Hashcode 
	
	
	//to comment & uncomment single line code---ctrl+/  
	//to comment multiple lines ctrl+shift+/
	//to uncomment multiple lines ctrl+shift+\
    //to comment multiple lines----select lines+right click+add comment block

	
   //toString(),constructor,setter-getter() can be called directly from source	

	
}
