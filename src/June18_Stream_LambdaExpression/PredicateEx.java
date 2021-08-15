package June18_Stream_LambdaExpression;

import java.util.function.Predicate;

public class PredicateEx {

	//Predicate means condition
	//predicate is the functional interface
	//it has predefined abstract method as below
	
   //	boolean test(T t);
	
	
	
	public static void main(String[] args) {
			
		Predicate<Integer> pr= i -> i>10;
		boolean ans=pr.test(50);
		System.out.println(ans);
		
		
		
		Predicate<String>   pre= s -> s.length() > 5;
		boolean ans1=pre.test("solapur");
		System.out.println(ans1);
		
		
		Predicate<String>  pre1=s -> s.length() > 5;
		boolean ans2=pre1.test("pune");
		System.out.println(ans2);

	
	}
}
