package June22_Thread;


//class demo extends Thread...is a relationship
//so demo is Thread
public class Demo extends Thread{
	
	public void run()
	{
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		Demo t1=new Demo();
		t1.start();
	}

}
