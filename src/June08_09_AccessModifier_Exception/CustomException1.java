package June08_09_AccessModifier_Exception;

public class CustomException1 {
	
	int accno,balance;
	
	public CustomException1(int accno, int balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	
	 void deposite(int dep)
	{
		balance=balance+dep;
	}// deposit ends here
	 
	 void withdraw(int withdraw) throws insufficientfunds
	 {
		 if((balance-withdraw)>500)
		 {
			 	balance=balance-withdraw;
		 }
		 else
		 {
			 	throw new insufficientfunds(balance-500);
		 }
	 }//withdraw ends here

	public static void main(String[] args) {
		CustomException1 obj=new CustomException1(12,600);
		obj.deposite(300);
		try
		{
			obj.withdraw(700);	
		}
		catch(insufficientfunds ex)        //parent class ref can not find ex in its class...so we have given ref of insufficientfunds
		{
			System.out.println("you can withdraw :"+ex.max);
		}
	}

}//class ends here


class insufficientfunds extends Exception       //insufficientfunds must be child of Exception
{
	int max;
	insufficientfunds(int temp)
	{
		max=temp;
	}

} 
