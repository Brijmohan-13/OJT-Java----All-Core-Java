package June02_Interface_this_super_;

public class L extends K {

	
	L()
	{
     //	super();  hidden code here...super class constructor called here
	 System.out.println("L Class constructor ");
		}
	
	public static void main(String[] args) {
		L obj=new L();
	}
}

//constructor calling must be the first statement of constructor
//  L()
//   {
//    SOP();
//    super();  ****compile time error
//    }
