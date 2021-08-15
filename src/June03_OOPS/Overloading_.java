package June03_OOPS;

public class Overloading_ {
	
	static void add(int a,int b)
	{
		System.out.println(" Hello ");
	}
	
	static void add(int a,float b)
	{
		System.out.println(" Hi ");
	}
	
	
	public static void main(String[] args) {
		
		add(10,20);             //calls " Hello "
		
		add(10,20L);			//calls " Hi "
		
//		add(10L,20);            compile time error
	}
}
//Ref is IMP for overloading
//object is IMP for overriding