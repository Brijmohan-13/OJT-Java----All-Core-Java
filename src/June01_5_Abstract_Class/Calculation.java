package June01_5_Abstract_Class;

public abstract class Calculation {

	abstract void calculate(int num);
	
}

class Cube extends Calculation
{

	@Override
	void calculate(int num) 
	{
		System.out.println("cube of the numbers is : "+ num*num*num);
	}
	
}

class Square extends Calculation
{

	@Override
	void calculate(int num) 
	{
		System.out.println("square of the numbers is : "+ num*num);
	}
}


class demo
{
	public static void main(String[] args) {
		Cube cube=new Cube();
		Square square=new Square();
		int num=5;
		cube.calculate(num);
		square.calculate(num);
		
	}
}