package June01_5_Abstract_Class;

public class AccountTest {

	
	public static void main(String[] args) {
	Account ref1=new Account(15,45000);
   //ref1==>Account class object at address(xxxxx)[accno=15,bal=45000]..object also contains toString();,updateBalance();
	
	
	System.out.println("Before updating balance");
	System.out.println(ref1);
	
	
	System.out.println("After updating balance");
	    ref1.updateBalance(ref1);   //******
	System.out.println(ref1);
	}
}
