package May28_Methods;

public class Employee {

	
	//Employee and Test Employee classes are similar to Student and TestStudent classes...only difference is here we have used default constructor
	//using default constructor global variables are initialzed to Zero
	//and these values are updated using Setter()
	
	int eNo;
	int sal;
	
	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", sal=" + sal + "]";
	}
	
	//one Getter(),setter() is for one variable
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
