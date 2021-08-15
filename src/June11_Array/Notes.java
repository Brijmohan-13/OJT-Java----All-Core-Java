package June11_Array;

public class Notes {
	
//Array-Array is special variable which stores multiple values in it of same data type and of fixed length
	
	public static void main(String[] args) {
		
		int[] ages=new int[5];       // 5 is length
									//if values are not assigned then default values are set
		ages[0]=15;                 // [] is memory block, 0 is index, 15 is 0th element of array
		ages[1]=20;
		ages[2]=25;
		ages[3]=45;
		ages[4]=60;
//		ages[5]=90;        this will give ArrayIndexOutOfBoundsException

	    int[] ages1={85,50,35,24,10};
	    
	    
	    for(int i=0;  i<ages.length ;  i++)        //for each can be also used here
	    {
	    	System.out.println(ages[i]);
	    }
	    
	    System.out.println("Another array starts here");
	    
	    
	    //for each loop is also called as for enhanced loop
	    for(int age:ages1)          //for Loop can be also used here
									//in for each loop variables are avoided...all the elements from the array are retrieved here
	    							//ages & age variables are pointing to same array
	    {
	    	System.out.println(age);
	    }
	}
}

//BELOW ALL ARE IMP INTERVIEW QUESTIONS-----
//length is a variable created by JVM for our Array
//a.length gives length of array
//a[1].length()  gives number of characters at given index in String Array
//if at given index null is present then it gives null pointer exception


//String[] str=new String[3];
//str[0]="JBK";     --correct
//str[0]=new String("JBK");      --correct
//String array stores reference in it. Ref will point to object. This object has content in it--"JBK"

//How to find out class name ?
//Student s=new Student();
//SOP(s.getClass().getName())     reference s will point to object of the class...this class name is given by this code

//String [] s=new String [];
//SOP{s.getClass().getName()}    this code gives class name of array

//int[] s=new int[];
//SOP{s.getClass().getName()}	 this code gives class name of array

//float[] s=new float[];
//SOP{s.getClass().getName()}    this code gives class name of array