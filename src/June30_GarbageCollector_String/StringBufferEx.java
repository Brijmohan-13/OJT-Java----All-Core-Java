package June30_GarbageCollector_String;

public class StringBufferEx {
	
	//StringBuffer object is synchronized...Thread safe
	//StringBuilder object is not synchronized...not Thread safe
	
	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("my");			//StringBuffer object created
		StringBuffer sb1=sb.append("sql");				//no new object...existing object updated	(remeber in comparison with String)
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb==sb1);
	}

}





//virtual world 
//real world