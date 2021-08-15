package June18_Serelization_Deserelization_FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
//*** Serialization is defined as the process of writing object contents in file
	
	public static void main(String[] args) throws Exception {
		Student obj=new Student(10, 50);
		
		FileOutputStream fout=new FileOutputStream("f1.txt");      //specifies file for writing object content
																	//if the file is not there in the project it will create
		
		ObjectOutputStream out =new ObjectOutputStream(fout);     //links object and file
		
		out.writeObject(obj);		//object is persisted here
		
		System.out.println("Objects contents are written in file successsfully");	
	}
}
