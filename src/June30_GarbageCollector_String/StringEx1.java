package June30_GarbageCollector_String;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String s1=new String("JBK");
		
	//	2 objects will get created with above Statement in...(object with new and constructor)
	//	Heap memory area
	//	SCP memory area  (String constant pool)
	
	//  however s1 reference will point to object in heap
		
		String s2="java";
	//	1 object will get created with above Statement in SCP...(object with double quote)
        String s3="java";
    //	since SCP does not duplicate objects s2,s3 will point to same object
        
    //	*****Remember String methods
        
        String fileName="temp.txt";
        System.out.println(fileName.endsWith(".txt"));
        
        String fileName1="temp.jpg";
        System.out.println(fileName1.endsWith(".txt"));
        
        String d="javabykiran";
        System.out.println(d.indexOf('a'));				//indexOf() gives first occurrence of char...char in argument...int is return type
        System.out.println(d.lastIndexOf('a'));			//lastIndexOf() gives last occurrence of char...char in argument...int is return type
        
        System.out.println(d.charAt(5));			//charAt()...argument is int...return type is char
        System.out.println(d.charAt(7));			//charAt()...argument is int...return type is char
        
        System.out.println(d.contains("kira"));
        
        System.out.println(d.substring(5));	   			//gives all characters from index 5 to last index
        System.out.println(d.substring(2, 6));	    	//gives all characters from index 2 to 5  (character of index 6 is excluded)
        System.out.println(d.substring(2,d.length()));	
        System.out.println(d.substring(2, 11));

        String st="javabykiran   ";
        System.out.println(st.trim());   //removes only last space
        
        
        String ss1="java";
        System.out.println(ss1.equals("java"));
        System.out.println(ss1.equals("javajava"));
        System.out.println(ss1.equals("JAVa"));
		System.out.println(ss1.equalsIgnoreCase("JAVa"));
		
		
		
		String s="javabyKIRAN";
		
		byte[] b=s.getBytes();		//getBytes() returns byte[]....all the ASCII values of characters in String
		
		for(byte by:b)
		{
			System.out.println(by);
		}
		
		
		String r1=new String("HELLO");			 //2 objects created one in heap and another in SCP
												 //reference r1 will point to object in heap
												//to point object in SCP we need to used intern()
		String r2=r1.intern();					//r2 will point to object in SCP
		
		System.out.println(r1==r2);				//false...since r1,r2 are pointing to objects at different memory area
		
		
	}
}
