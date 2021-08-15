package May27_Char_datatype_Static_Final_Variables_Methods;

public class rough 
{
int rno;
int marks;

void m1()
{System.out.println(rno);}//m1 ends here

rough(int rno,int marks) //FORMAL ARGUMENTS
{
	this.rno=rno;
	this.marks=marks;}// rough ends here

public static void main(String[] args)
{
rough obj1=new rough(5,90); //ACTUAL ARGUMENTS
rough obj2=new rough(8,75); //ACTUAL ARGUMENTS

System.out.println(obj1.rno);
System.out.println(obj1.marks);
System.out.println(obj2.rno);
System.out.println(obj2.marks);
}//main ends here

//There is one more argument NAMED ARGUEMENTS....it increases Readability of the program...parameter can be altered 
}
