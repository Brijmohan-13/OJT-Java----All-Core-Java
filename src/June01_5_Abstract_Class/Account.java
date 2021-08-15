package June01_5_Abstract_Class;

public class Account {

//****NOTE-Since reference is written in main method we can not write reference out of main method
//from main method (with reference) we call variables,methods
	
	int accno;
	int bal;
	
	public Account(int accno, int bal) {
		super();
		this.accno = accno;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", bal=" + bal + "]";
	}
	
	
	int updateBalance(Account ac)
	{
		ac.bal=ac.bal+1000;
		return bal;
	}
	
	//int a,b;----variables declaration
	//a=10----variables initialization
	//b=20----variables initialization
	
	//void m1();--------method declaration
	//void m1() {SOP()}----method definition
	}
