package June14_15_16_17_Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee_Comparator{

	int eno,salary;
	
	public Employee_Comparator(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]";
	}
}//class Employee ends 


class Sort1 implements Comparator<Employee_Comparator>
{
	@Override
	public int compare(Employee_Comparator s1, Employee_Comparator s2) {
		
		if(s1.eno>s2.eno)
			return 1;
		else if(s1.eno<s2.eno)
			return -1;
		else
			return 0;			//this do not allow duplicate eno
	}
}//class Sort1 ends


class Sort2 implements Comparator<Employee_Comparator>
{
	@Override
	public int compare(Employee_Comparator s1, Employee_Comparator s2) {
		
		if(s1.salary>s2.salary)
			return 1;
		else if(s1.salary<s2.salary)
			return -1;
		else
			return 0;      //this do not allow duplicate salary
	}
}//class Sort2 ends

class TestEmployee
{
	public static void main(String[] args) {
		
		Employee_Comparator employee1=new Employee_Comparator(5,1000);
		Employee_Comparator employee2=new Employee_Comparator(10,3000);
		Employee_Comparator employee3=new Employee_Comparator(7,500);
		Employee_Comparator employee4=new Employee_Comparator(2,10000);
		
		TreeSet<Employee_Comparator> ts1=new TreeSet<Employee_Comparator>(new Sort1());
		ts1.add(employee1);
		ts1.add(employee2);
		ts1.add(employee3);
		ts1.add(employee4);

		System.out.println("Sorting Based on Employee number");
		System.out.println(ts1);
		for(Employee_Comparator ts:ts1)
		{
			System.out.println(ts);
		}
		System.out.println(ts1.size());

		
		TreeSet<Employee_Comparator> ts2=new TreeSet<Employee_Comparator>(new Sort2());
	/*	ts2.add(employee1);
		ts2.add(employee2);
		ts2.add(employee3);
		ts2.add(employee4);  */
		
		ts2.addAll(ts1);
		
		System.out.println("Sorting Based on Employee salary");
		System.out.println(ts2);
		for(Employee_Comparator ts : ts2)
		{
			System.out.println(ts);
		}
		System.out.println(ts2.size());

	}
	}//TestEmployee ends


