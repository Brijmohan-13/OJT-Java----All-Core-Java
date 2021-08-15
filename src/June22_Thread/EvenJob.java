package June22_Thread;

import static java.lang.Thread.sleep;

public class EvenJob implements Runnable{

	@Override
	public void run() {

		for(int i=1;  i<=100;  i++)
				{ 
					if(i%2==0)
					System.out.println("Even number : "+i);}
		
					try {
						Thread.sleep(1000*5);					//to slow down on console
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
	public void run(String s) {}        //thread will certainly call above run()....compiler will not give error to this run() also
		
}//class EvenJob ends

class OddJob implements Runnable{

	@Override
	public void run() {

		for(int i=1;  i<=100;  i++)
			if(i%2==1)
				System.out.println("Odd number : "+i);
		
				try {
					Thread.sleep(1000*2);					//to slow down on console
				} catch (InterruptedException e) {
					e.printStackTrace();		}
				
	}//run() ends
}//class OddJod ends


class Test{
		public static void main(String[] args) throws Exception {
		
		EvenJob evenjob=new EvenJob();
		OddJob oddjob=new OddJob();
		
		Thread t1=new Thread(evenjob);
		Thread t2=new Thread(oddjob);
		
		t1.start();			//parallel,simultaneous execution
		t2.start();
/*	
		t1.run();           // non-parallel execution
		t2.run();
*/		
		t1.join();			//main thread will be executed at the end..i.e. Program is over statement
//		t2.join();
		
		System.out.println("Program is over");
		
		
}
}
