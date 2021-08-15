//Program for addition & Subtraction of two numbers//**
package June01_5_Abstract_Class;
import java.util.Scanner;

public class Operations {
	int num1; //object variables declaration
	int num2; //object variables declaration
	
		public Operations(int num1, int num2) {
		super();    
		this.num1 = num1;
		this.num2 = num2;
	}  //object variables initialized

	void addition() //method for addition
   {	int c=num1+num2;
		System.out.println("The addition of two numbers is "+c);
	}//addition ends
	
	void subtraction()  //method for subtraction
	{
		int d=num1-num2;
		System.out.println("The subtraction of two numbers is "+d);
	}//subtraction ends
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the First Number");  //
			int temp1=sc.nextInt();
			System.out.println("Enter the Second Number");
			int temp2=sc.nextInt();			
			sc.close();
		Operations op=new Operations(temp1,temp2);
		//op reference=>[num1=from user,num2=from user]Operations class object at address[1000]
		
		op.addition();
		op.subtraction();
	}//main ends here
}
