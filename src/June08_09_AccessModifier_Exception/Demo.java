package June08_09_AccessModifier_Exception;
//Class case exception*******
//Class cast Exception occurs when Reference type and object type don't have relationship (when there is no parent child relationship in reference and child)

public class Demo {
	Object m1()
	{
		return new String("Hello");
	}
	
	Object m2()
	{
		return new StringBuffer("Java");
	}
}

class ObjectReturnType{
	
	public static void main(String[] args) 
	{
		System.out.println("program strted");
	Demo d=new Demo();
	
	Object o=d.m1();    //o is object class reference pointing to String Class object (object and string are parent child)
	String ss=(String)o;
	
	Object o1=d.m2();    //o is object class reference pointing to StringBuffer Class object (object and String Buffer are parent child)
	String sss=(String) o1;    //gives class cast exception...if there is any relation then we can cast either implicitly/explicitly

	
	String str=(String) d.m2();          //class casting exception...String and StringBuffer are not parent child
	                                     ////gives class cast exception...if there is any relation then we can cast either implicitly/explicitly	
	}}
