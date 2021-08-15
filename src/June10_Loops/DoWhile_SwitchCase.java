package June10_Loops;

import java.util.Scanner;

//switch case inside do while
public class DoWhile_SwitchCase {
	
	public static void main(String[] args) {
			
		int num1=0;
		int num2=0;
		int result;
		String answer=null;	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		num1=sc.nextInt();
		System.out.println("Please enter second number");
		num2=sc.nextInt();
		
		do
		{
			System.out.println("Which operation would you like to perform ?");
			System.out.println("1.Addition  2.Subtraction   3.Multiplication  4.Dividation");
			int choice=sc.nextInt();
			
						switch (choice)
						{	
						case  1:
								result=num1+num2;
								System.out.println("Addition of numbers is :" +result);
								break;
						case  2:
							result=num1-num2;
							System.out.println("Subtraction of numbers is :"+result);
							break;
								
						case  3:
							result=num1*num2;
							System.out.println("Multiplication of numbers is :" +result);
							break;
							
					    case  4:
					    	result=num1/num2;
				    		System.out.println("Dividation of numbers is :"+result);
				    		break;
				    		
				    	default:
				    			System.out.println("please enter number between 1 & 4 only");			
				     	}
						
				System.out.println("Would you like to perform any peerform any operation again (yes/no)?");
				answer=sc.next();
		}while(answer.equals("yes"));
		
		System.out.println("Bye");
		
		
}// main ends here
}// class ends here