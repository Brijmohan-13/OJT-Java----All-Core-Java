package June22_Thread;

import java.util.Scanner;

//Runnable is functional interface
//Thread runs on run()
public class Job implements Runnable{

	@Override
	public void run() {						//Job is written in run()
			System.out.println("java is easy");		
	}//run ends
	}//class Job ends

class Demo1{
	public static void main(String[] args) {
		
		//******In place of object of interface, we have to send object of its implementation class
		//following are the three ways for pass object in Thread()
		//Threads t1,t2,t3 have separate run methods based on which object is passed through Thread()
		
						       //anonymous object
		Thread t1=new Thread(new Job());
		
		t1.start();       //ready to run state/runnable state
		
							 //object by Lambda Expression
		Thread t2=new Thread(() -> System.out.println("java is very easy if we know OOPS"));
		
		t2.start();
		
							 //anonymous class object
		Thread t3=new Thread(new Runnable()
		//Anonymous class starts
			{
			@Override
			public void run() {
				System.out.println("please enter some text");
				String t=new Scanner(System.in).next();				//waiting state/blocked state
					
				System.out.println(t);				
			}
		}//anonymous class ends
		);
		
		t3.start(); //ready to run state/runnable state
		
		System.out.println("when i will get executed ??");
		
		
		//dead state
	}
}