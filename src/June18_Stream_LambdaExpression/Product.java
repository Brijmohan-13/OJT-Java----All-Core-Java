package June18_Stream_LambdaExpression;

public class Product {
	
	int no;
	String name;
	float price;
	
	
	public Product(int no, String name, float price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	}
