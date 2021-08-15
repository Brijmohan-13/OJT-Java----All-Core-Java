package June11_Array;

public class demo {
	
//		   	reference		 object
//	static 	int [] a		=new int[2];
	
	static int [] a;
	
		public static void main(String[] args) 
		{
				System.out.println(a);      //prints null address ...ref is not pointing to any object...so it do not have any address in it
				a=new int[2];				//now reference is pointing to object
				System.out.println(a);		//this gives address
				System.out.println(a[0]);	//this gives 0...because at index 0 ,0 present default 
				
				
				System.out.println(new int [] {10,20,30});    //anonymous array
    
				
				
				
//				***********************************************
				String [] str={"abc pqr","xyz"};
				
				System.out.println(str[0].split(" ") [0]);
    
		
		
		
		} 
}
