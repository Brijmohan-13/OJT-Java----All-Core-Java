package June22_Thread;

//MultiThreading--when multiple threads are Accessing / Updating the same object 

//When multiple threads are updating the same object, then we may get Inconsistent output
//To avoid it we have to use synchronized keyword  for method
//But When there are large number of statements in methods,out of which very few are updating object and rest are not...then synchronized Block is preferred over synchronized method

//But When multiple threads are only accessing the same object, then we do not need to use synchronized keyword

public class Job1 implements Runnable {
	
	int i;				//object variable....threads t1,t2 are updating object variable

	@Override
	public synchronized void run() {		//Entire run() is synchronized
											//line 20,35 are not updating object...but still they are synchronized...so here synchronized Block is  preferred more
										
		
			System.out.println("start of method");		
		
								//SYNCHRONIZED BLOCK
								/*synchronized (this) {
									for(i=1;  i<=3;  i++)
									{
										System.out.println("Value if i by "+Thread.currentThread().getName() +" is "+i);
									}
								}*/			
			
			for(i=1;  i<=3;  i++)
			{
				System.out.println("Value if i by "+Thread.currentThread().getName() +" is "+i);
			}
			
			System.out.println("end of method");
	}
	
	
	
	public static void main(String[] args) {
		
		Job1 job=new Job1();
		
		Thread t1=new Thread(job,"Shriniwas");   //t1 is reference....Shriniwas is just Thread name
		Thread t2=new Thread(job,"Akshay");		 //t2 is reference....Akshay is just Thread name

		t1.start();
		t2.start();
		
	}// main ends
	}//class Job1 ends
