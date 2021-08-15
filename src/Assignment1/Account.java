package Assignment1;
public class Account {	
	
	int accountNumber,balance;  //object variables
	static String bankName="SBI";    //static  variable
	
	public Account(int accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
    }// parameterized constructor ends here
	
		void deposit(int dep)
	     {
		       balance=balance+dep;
		       System.out.println("You have deposited Rs."+dep+" Successfully."+" Your current balance is "+balance);
	     } //deposit ends here
	
	void withdraw(int withdraw)
	    {
		     if(balance>withdraw)
		       {
			     balance=balance-withdraw;
			     System.out.println("You have debited Rs."+withdraw+"."+"Your current balance is "+balance);
		       }
		     else
		       {
			     System.out.println("Sorry...Insufficient funds !!! Your current balance is :"+balance);
	           }
	    }  // withdraw ends here
		
	boolean transferAmount (Account source,Account destination, int transferAmount )
	    {
		    if (source.balance>transferAmount)
		    {
		    	source.balance=source.balance-transferAmount;         //source.balance is also ok here
			System.out.println(transferAmount + " transferred successfully."+"Your current balance is :"+source.balance);    //source.balance is also ok here
			return true;
	     	}
		    else
	    	{
			System.out.println("Sorry...Insufficient funds !!! Your current balance is :"+source.balance);      //source.balance is also ok here
			return false;
		}		
	} //transferAmount ends here
	}
