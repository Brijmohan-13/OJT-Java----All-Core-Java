package June21_NestedClass_NestedInterface;

public interface MyInterface {
	
	void m1();
}

class Impl implements MyInterface{

	@Override
	public void m1() {
			System.out.println("Hii");		
	}
}

class Test
{
	
	void display(MyInterface k)	{ k.m1(); }

	public static void main(String[] args) {
		
		new Test().display(() -> System.out.println("hello"));       //lambda expression
		
		new Test().display(new Impl());								//
		
		new Test().display(new MyInterface()            //new MyInterface() ctrl+space
			// Anonymous inner class starts          
			{
			@Override
			public void m1() {
				System.out.println("bye");				
			}//Anonymous inner class ends
		});
	
}//main ends
}//class ends
//also class can be written inside method 