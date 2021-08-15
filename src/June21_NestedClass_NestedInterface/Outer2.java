package June21_NestedClass_NestedInterface;

//nested interface
public interface Outer2 {
	
	void m1();
	
	//inner interface
	interface Inner2
	{
		void m2();
	}// inner interface ends

}//outer interface ends


class impl1 implements Outer2
{
	@Override               //only m1 need to be implemented
	public void m1() {
		System.out.println("Hello");		
	}
	
	public static void main(String[] args) {
		
		Outer2 outer=new impl1();
		outer.m1();
	}
	
}//class impl ends


class impl2 implements Outer2.Inner2{

				@Override
				public void m2() {
					System.out.println("hii");		
				}
				
				public static void main(String[] args) {
					
					Outer2.Inner2 inner=new impl2();
					inner.m2();
				}
								
	
}//class impl1 ends
