package May31_Single_Turn_Object;

public class Ex {
	
	
	int eno=10;
	int sal=2000;
	
	public Ex(int eno, int sal) {
		super();
		this.eno = eno;
		this.sal = sal;
	}

	public static void main(String[] args) {
		Ex suresh=new Ex(15,30000);
		System.out.println(suresh.eno);
		System.out.println(suresh.sal);
		
		
		//global variables initialized but not taken into account while SOP...because constructor create object with values 15,30000
	}
	//General-
	//we use this keyword when local variables are with same name as that of global variables..or else not req.
	/*int a;
	  int b;
	
	  Ex(int a,int b)
	  {this.a=a;
	   this.b=b;}*/
	
	
	//ANONYMOUS Object should be created only when one variable/one method is be called	
	
}
