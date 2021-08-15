package May28_Methods;

public class EmployeeTest {
	
	public static void main(String[] args) {
	Employee suresh=new Employee();
	
	System.out.println(suresh.eNo);
	System.out.println(suresh.sal);
	
	suresh.seteNo(15);  //here set() updates values of the variables
	suresh.setSal(30000); //here set() updates values of the variables
	
	System.out.println(suresh.eNo);
	System.out.println(suresh.sal);
	System.out.println(suresh);  
	
	//what are primitive literals ?
	// int 1,2,3,4,,6 are integer primitive literals
	//float 1.0f,1.3f,5.3f are float literals
	}
}
