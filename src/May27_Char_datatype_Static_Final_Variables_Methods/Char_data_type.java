package May27_Char_datatype_Static_Final_Variables_Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Char_data_type

{
public static void main(String[] args) throws Exception 
{
char temp='a';
System.out.println(temp);

char temp1=97;
System.out.println(temp1);

char temp2='\u0061';
System.out.println(temp2);
/// since data type is char here so SOP will be char only

//scanner class in java is used to read input data from user...inputs should be primitive data type only 
char ch=new Scanner(System.in).next().charAt(0);
System.out.println(ch);


//(System.in)   is for keyboard Input from user
//here next();  method is waiting for inputs from user...to read the data...will convert it to string temporarily \ for charAt method
//charAt(); method gives character at defined index....this is single character reading
///data type is char here so SOP will be char only...



//Scanner and BufferReader Class are used to read input data from User
//BUfferedReader class is  since JDK 1.1........see in lecture for BufferReader
//Scanner class is since JDK 1.5

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the character-");
int ddd=br.read();
char gem=(char)ddd;
System.out.println(gem);
}
}
