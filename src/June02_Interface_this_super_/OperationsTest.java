package June02_Interface_this_super_;

public class OperationsTest implements Operations{

	@Override
	public void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}

	@Override
	public void subtraction(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	public static void main(String[] args) {
		
		Operations op=new OperationsTest();// values are written here since there are no global variables
		op.addition(90, 50); //values are  written here since addition & subtraction has local variables
		op.subtraction(50, 20);
	
	}

}
