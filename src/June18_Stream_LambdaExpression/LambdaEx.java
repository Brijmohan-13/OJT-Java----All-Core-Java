package June18_Stream_LambdaExpression;

public class LambdaEx {

}


interface ABC
{
	void m1(int a,int b);
}
class Test{
	
	public static void main(String[] args) {
		
		ABC obj = (a,b) ->  System.out.println(a+b) ;
		obj.m1(10, 30);
		}
}


interface XYZ
{
	int m2(int c,int d);
}
class Test1{
	
	public static void main(String[] args) {
		
		XYZ obj1 =(c,d) -> c+d;
		System.out.println(obj1.m2(50, 10));
		}
}



interface PQR
{
	int m3(int c,int d);
}
class Test2{
	
	//return statement is not needed for single line method definition
	//return statement is needed for multiple line method definition
	
	public static void main(String[] args) {
		
		PQR obj2 =(c,d) -> {
			int sum=c+d;
			System.out.println(sum);
			return sum;
		};
		
		obj2.m3(50, 40);
		
}//main ends
}//class ends