package June18_Stream_LambdaExpression;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream_LambdaExpression {
	
	//Stream is Interface
	//Stream is sequence of elements/objects
	
	//Difference between Collection & Stream
	//both have objects in it 
	//collection can iterated again and again
	//stream can be iterated only ONCE
	
	//filter() of stream is intermediate operation...since it gives object of stream not collection
	//wherever you see predicate interface use directly lambda expression
	
	public static void main(String[] args) {
		
		ArrayList<Product> product=new ArrayList<>();
		ArrayList<Product> productlist=new ArrayList<>();
		
		Product p1=new Product(1, "hp", 10000f);
		Product p2=new Product(2, "dell", 20000f);
		Product p3=new Product(3, "lenovo",30000f);
		Product p4=new Product(4, "sony", 40000f);
		Product p5=new Product(5, "iPad", 50000f);
		
		productlist.add(p1);
		productlist.add(p2);
		productlist.add(p3);
		productlist.add(p4);
		productlist.add(p5);
		
		for(Product pr :productlist)
		{
			if(pr.price>23000)
				{
				product.add(pr);
		  		}
		}                                       // manual filtering
		
		System.out.println(productlist);
		System.out.println(product);
		
		
		System.out.println("Stream after using Filter method");

//									     =                 object.filer()                   //object of stream is created since we have to use its filter()
		Stream <Product> filteredStream  =   productlist.stream().filter(products -> products.price>25000);
		System.out.println("filtered stream");
		
		filteredStream.forEach((ppp) -> System.out.println(ppp));      //consumer interface as argument
//		filteredStream.forEach(System.out::println);      //out of the 2 for Loops we can can use any one(since in stream, iteration can be done only once)
														  //we can use existing method definition_refering prinLn method from printStream class
		
		
		System.out.println("Stream after using Map method");

		//similarly new stream 
		Stream <Float> priceDoubled=productlist.stream().map(pp -> (pp.price*2));
// like Arraylist <String>
		priceDoubled.forEach(System.out::println);
		
		
		System.out.println("Stream after using reduce method");

	//  similarly
	//	Optional<Float> optional  =  priceDoubled.reduce((price1,price2) -> price1+price2);
	//  System.out.println(optional );
		
		//filter(),map(), are intermediate operation..because they return stream and we can work on them
        //reduce() is terminal operation since it gives final value....further operation is not possible on it
			
	}//main ends
}//class ends


//LAMBDA EXPRESSION ******(since JDK 1.8)
interface A
{
	void m1();
}//interface A ends


class Impl implements A
{
	@Override
 	public void m1() {System.out.println("Hello");}
	
	public static void main(String[] args) {
		A obj=new Impl();
		obj.m1();
		
		//Without writing implementation class, we can define the abstract methods of interface, by using Lambda Expression*********
		//Class,Constructor and Object is created internally
		//It is only for functional interface (interface having only one method)
		//It can not be used with Abstract class
		//Lambda Expression is internally converted into Object
		//Advantage--code reduction
		
	   //		Reference          	    Object i.e. Lambda Expression
		 		A ref   	 =    	   () -> System.out.println("hii");
	   //						parameter -> Expression
	   //						argument  -> definition
		 		ref.m1();
	}//main ends
}//class Impl ends


