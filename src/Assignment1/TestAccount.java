package Assignment1;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account ramesh=new Account(123,15000);
		Account suresh=new Account(456,20000);
		
		ramesh.deposit(1000);
		ramesh.withdraw(500);
		ramesh.transferAmount(ramesh, suresh,1000);	
		
		System.out.println("--------------------------------------------------------------------------------");
		
		suresh.deposit(4000);
		suresh.withdraw(2000);
		suresh.transferAmount(suresh,ramesh,30000);		
		
		
	}
	}