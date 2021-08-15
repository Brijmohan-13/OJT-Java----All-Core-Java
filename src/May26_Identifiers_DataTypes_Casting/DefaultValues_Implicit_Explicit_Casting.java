package May26_Identifiers_DataTypes_Casting;

public class DefaultValues_Implicit_Explicit_Casting {

static boolean flag;
static char example;
static int demo;
static String ex;



	
	public static void main(String[] args)
	{

		System.out.println(flag);
		System.out.println(example);
		System.out.println(demo);
		System.out.println((int)example);
		System.out.println(ex);
//		System.out.println(ex.length());     gives null pointer exception
		
		//CASTING//
		
		float d=10;
		System.out.println(d);
		
		int g=(int)d;    //type casting -explicit casting
		System.out.println(g);
		
		//int,Long can be automatically  converted in float.......implicit casting
		//int,Long can not be automatically  converted in float...type casting req.
		// automatically converting data types---byte>short>int>long>float>double          //type promotion
		// automatically converting data types---char>int
		//other data type conversion can be done explicitly----data loss occurs there

		long phone=123456789l;
		float mobile=phone;
		
		float Phone1=5555555f;
		long mobile1=(long) Phone1;
		
		float uuu=5.5f;
		if(uuu==5.5) ///here 5.5 is considered as double
			System.out.println("equal");
		else 
			System.out.println("not equal");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

