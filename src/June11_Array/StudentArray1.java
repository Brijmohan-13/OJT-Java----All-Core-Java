package June11_Array;

import java.util.Scanner;

//inputs from user--dynamic values
//for is used two times to enter the elements and to retrieve the elements
public class StudentArray1 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Students objects would you like to save ?");
		int size=sc.nextInt();
					
		Student[] students=new Student[size];
		
		//students [0]=new Student(11,50);     //keep this in mind,while writing code for inputs from user
		
		for (int i=0; i<size;  i++)
		{
			System.out.println("Enter roll number of the student.");
			int rno=sc.nextInt();

			System.out.println("Enter marks of the student.");
			int marks=sc.nextInt();
			
			students[i]=new Student(rno,marks);
		}
		
		for(int i=0; i<size  ;i++)
		{
			System.out.println(students[i]);
		}
			
	}
}
