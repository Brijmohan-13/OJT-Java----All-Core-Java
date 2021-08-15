package June18_Serelization_Deserelization_FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Deserialization is the process of reading object contents from the file
public class DeserializationEx {
	
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fin = new FileInputStream("f1.txt");
		
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		Student s=(Student) oin.readObject();          //type casting
		
		System.out.println(s.rno+","+s.marks);
		
		oin.close();
		
	//to write----> FileOutputStream
	//to read----> FileInputStream

	}
	}
