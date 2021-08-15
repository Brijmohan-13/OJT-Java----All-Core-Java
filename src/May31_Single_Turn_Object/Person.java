package May31_Single_Turn_Object;

public class Person {
	
	int pid;
	int page;
	
	public Person(int pid, int page) {
		super();
		this.pid = pid;
		this.page = page;
	}
	
	public static void main(String[] args) {
		Person p1=new Person(11,25);
		Person p2=new Person(21,50);
		
		p1=p2;
		//initially p1 reference stores address(1000) in it with values 11,25
		//p2 reference stores address(2000) in it with values 11,25
		//when code p1=p2; is written p1 stores same address 

		System.out.println(p1==p2);
			
		
		final Person p3=new Person(5,99);
	          Person p4=new Person(8,88);
	          
	          p4=p3;
//	          p3=p4;  ***this is not possible since p3 is final we can not store address in it
	}
	
	
}
